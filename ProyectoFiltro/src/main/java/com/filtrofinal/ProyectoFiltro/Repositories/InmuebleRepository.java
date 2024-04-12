package com.filtrofinal.ProyectoFiltro.Repositories;

import com.filtrofinal.ProyectoFiltro.Repositories.Entities.InmuebleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InmuebleRepository extends JpaRepository<InmuebleEntity, Integer> {

List<InmuebleEntity> findAllByTipo(String tipoInmueble);
}
