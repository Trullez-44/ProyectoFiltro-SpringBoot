package com.filtrofinal.ProyectoFiltro.Repositories;

import com.filtrofinal.ProyectoFiltro.Repositories.Entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

    Optional<UserEntity> findByEmail(String email);

}
