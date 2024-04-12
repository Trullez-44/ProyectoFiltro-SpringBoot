package com.filtrofinal.ProyectoFiltro.Services;

import com.filtrofinal.ProyectoFiltro.DTO.InmuebleDTO;
import com.filtrofinal.ProyectoFiltro.DTO.InmuebleVillaDTO;
import com.filtrofinal.ProyectoFiltro.Repositories.Entities.InmuebleEntity;

import java.util.List;

public interface InmuebleService {
    InmuebleVillaDTO saveVilla(InmuebleVillaDTO inmuebleVillaDTO);

    List<InmuebleVillaDTO> getAllVillas(String tipoInmueble);

    InmuebleDTO getById(Integer id);

    String deleteById(Integer id);

    InmuebleDTO update(InmuebleDTO inmuebleDTO);
}
