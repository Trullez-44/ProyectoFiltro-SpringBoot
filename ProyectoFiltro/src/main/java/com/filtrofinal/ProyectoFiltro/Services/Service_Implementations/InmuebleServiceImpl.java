package com.filtrofinal.ProyectoFiltro.Services.Service_Implementations;

import com.filtrofinal.ProyectoFiltro.DTO.DTO_CONVERT.InmuebleVIlla_Convert;
import com.filtrofinal.ProyectoFiltro.DTO.DTO_CONVERT.Inmueble_Convert;
import com.filtrofinal.ProyectoFiltro.DTO.InmuebleDTO;
import com.filtrofinal.ProyectoFiltro.DTO.InmuebleVillaDTO;
import com.filtrofinal.ProyectoFiltro.Repositories.Entities.InmuebleEntity;
import com.filtrofinal.ProyectoFiltro.Repositories.Entities.Villa;
import com.filtrofinal.ProyectoFiltro.Repositories.InmuebleRepository;
import com.filtrofinal.ProyectoFiltro.Repositories.VillaRepository;
import com.filtrofinal.ProyectoFiltro.Services.InmuebleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class InmuebleServiceImpl implements InmuebleService {

//    private final Inmueble_Convert inmuebleConvert;
    private final InmuebleRepository inmuebleRepository;
    private final InmuebleVIlla_Convert inmuebleVillaConvert;
//    private final VillaRepository villaRepository;


    @Override
    public InmuebleVillaDTO saveVilla(InmuebleVillaDTO inmuebleVillaDTO) {
        InmuebleEntity inmuebleEntity = inmuebleVillaConvert.convertToEntity(inmuebleVillaDTO);
//        Villa villa = villaRepository.findById(inmuebleVillaDTO.getVilla_id());

        inmuebleRepository.save(inmuebleEntity);

        return inmuebleVillaConvert.convertToDTO(inmuebleEntity);
    }

    @Override
    public List<InmuebleVillaDTO> getAllVillas(String tipoInmueble) {
List<InmuebleEntity> inmuebleEntities = inmuebleRepository.findAllByTipo(tipoInmueble);
    return inmuebleEntities.stream().map(inmuebleVillaConvert::convertToDTO)
            .collect(Collectors.toList());
    }

    @Override
    public InmuebleDTO getById(Integer id) {
        return null;
    }

    @Override
    public String deleteById(Integer id) {
        return null;
    }

    @Override
    public InmuebleDTO update(InmuebleDTO inmuebleDTO) {
        return null;
    }
}
