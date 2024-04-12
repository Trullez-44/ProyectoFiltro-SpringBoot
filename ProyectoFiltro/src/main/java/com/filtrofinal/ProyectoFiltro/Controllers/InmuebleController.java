package com.filtrofinal.ProyectoFiltro.Controllers;

import com.filtrofinal.ProyectoFiltro.DTO.InmuebleDTO;
import com.filtrofinal.ProyectoFiltro.DTO.InmuebleVillaDTO;
import com.filtrofinal.ProyectoFiltro.Repositories.Entities.InmuebleEntity;
import com.filtrofinal.ProyectoFiltro.Services.InmuebleService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("inmuebles")
@RequiredArgsConstructor
public class InmuebleController {

    private final InmuebleService inmuebleService;

    @PostMapping()
    public InmuebleVillaDTO saveVilla(@Validated @RequestBody InmuebleVillaDTO inmuebleVillaDTO) {
        return inmuebleService.saveVilla(inmuebleVillaDTO);
    }

    @GetMapping("/villas")
    public List<InmuebleVillaDTO> getAllVillas() {
        return inmuebleService.getAllVillas("VILLA");
    }

    @GetMapping("/{id}")
    public InmuebleDTO getById(@PathVariable Integer id) {

        return inmuebleService.getById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable Integer id) {
        return inmuebleService.deleteById(id);
    }
}
