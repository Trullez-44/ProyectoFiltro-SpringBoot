package com.filtrofinal.ProyectoFiltro.Services;

import com.filtrofinal.ProyectoFiltro.Repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JWTUserDetailsService implements UserDetailsService{

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return this.userRepository.findByEmail(username)
                .map(usuario ->{
                    final var authorities = usuario.getRoles()
                            .stream()
                            .map(role-> new SimpleGrantedAuthority(role.getName()))
                            .toList();
                    return new User(usuario.getEmail(), usuario.getPassword(), authorities);
                }).orElseThrow(() -> new UsernameNotFoundException("User not exist"));
    }

}
