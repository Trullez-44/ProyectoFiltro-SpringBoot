package com.filtrofinal.ProyectoFiltro.Repositories;

import com.filtrofinal.ProyectoFiltro.Repositories.Entities.Villa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VillaRepository extends JpaRepository <Villa, Integer> {
}
