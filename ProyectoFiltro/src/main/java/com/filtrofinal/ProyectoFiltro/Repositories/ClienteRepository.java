package com.filtrofinal.ProyectoFiltro.Repositories;

import com.filtrofinal.ProyectoFiltro.Repositories.Entities.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Integer> {

}
