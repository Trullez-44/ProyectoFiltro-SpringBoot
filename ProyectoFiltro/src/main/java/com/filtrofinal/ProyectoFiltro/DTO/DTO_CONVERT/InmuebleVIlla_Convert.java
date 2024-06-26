package com.filtrofinal.ProyectoFiltro.DTO.DTO_CONVERT;

import com.filtrofinal.ProyectoFiltro.DTO.InmuebleVillaDTO;
import com.filtrofinal.ProyectoFiltro.Repositories.Entities.InmuebleEntity;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InmuebleVIlla_Convert {

    private final ModelMapper modelMapper;

    public InmuebleEntity convertToEntity(InmuebleVillaDTO inmuebleDTO) {
        return modelMapper.map(inmuebleDTO, InmuebleEntity.class);
    }

    public InmuebleVillaDTO convertToDTO(InmuebleEntity inmuebleEntity) {
        InmuebleVillaDTO inmuebleVillaDTO = modelMapper.map(inmuebleEntity, InmuebleVillaDTO.class);
        return inmuebleVillaDTO;
    }
}
