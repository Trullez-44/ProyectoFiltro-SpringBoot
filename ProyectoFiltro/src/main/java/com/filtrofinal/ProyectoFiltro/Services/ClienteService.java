package com.filtrofinal.ProyectoFiltro.Services;

import com.filtrofinal.ProyectoFiltro.Repositories.Entities.ClienteEntity;

import java.util.List;

public interface ClienteService {

    ClienteEntity save(ClienteEntity clienteEntity);

    List<ClienteEntity> getAll();

    ClienteEntity getById(Integer id);

    String deleteById(Integer id);

    ClienteEntity update(ClienteEntity clienteEntity);
}
