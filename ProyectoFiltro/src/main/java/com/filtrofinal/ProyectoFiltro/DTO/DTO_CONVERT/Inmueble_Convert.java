package com.filtrofinal.ProyectoFiltro.DTO.DTO_CONVERT;

import com.filtrofinal.ProyectoFiltro.DTO.InmuebleDTO;
import com.filtrofinal.ProyectoFiltro.Repositories.Entities.InmuebleEntity;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Inmueble_Convert {

    private final ModelMapper modelMapper;

    public InmuebleEntity convertToEntity(InmuebleDTO inmuebleDTO) {
        return modelMapper.map(inmuebleDTO, InmuebleEntity.class);
    }

    public InmuebleDTO convertToDTO(InmuebleEntity inmuebleEntity) {

        return modelMapper.map(inmuebleEntity, InmuebleDTO.class);
    }
}
