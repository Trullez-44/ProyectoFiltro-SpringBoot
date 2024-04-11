package com.filtrofinal.ProyectoFiltro.Services.Service_Implementations;

import com.filtrofinal.ProyectoFiltro.Repositories.ClienteRepository;
import com.filtrofinal.ProyectoFiltro.Repositories.Entities.ClienteEntity;
import com.filtrofinal.ProyectoFiltro.Services.ClienteService;
import com.filtrofinal.ProyectoFiltro.exceptions.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteServiceImpl implements ClienteService {
    private final ClienteRepository clienteRepository;
    @Override
    public ClienteEntity save(ClienteEntity clienteEntity) {
        return clienteRepository.save(clienteEntity);
    }

    @Override
    public List<ClienteEntity> getAll() {
        return clienteRepository.findAll();
    }

    @Override
    public ClienteEntity getById(Integer id) {
        return clienteRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Cliente no encontrando con el ID "+ id));
    }

    @Override
    public String deleteById(Integer id) {
        clienteRepository.deleteById(id);
        return "Cliente con el ID "+ id+ " eliminado correctamente";
    }

    @Override
    public ClienteEntity update(ClienteEntity clienteEntity) {
        return null;
    }
}
