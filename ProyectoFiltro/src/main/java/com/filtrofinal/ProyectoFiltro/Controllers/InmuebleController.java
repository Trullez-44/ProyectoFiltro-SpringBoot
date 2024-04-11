package com.filtrofinal.ProyectoFiltro.Controllers;

import com.filtrofinal.ProyectoFiltro.DTO.InmuebleVillaDTO;
import com.filtrofinal.ProyectoFiltro.Repositories.Entities.ClienteEntity;
import com.filtrofinal.ProyectoFiltro.Repositories.Entities.InmuebleEntity;
import com.filtrofinal.ProyectoFiltro.Services.ClienteService;
import com.filtrofinal.ProyectoFiltro.Services.InmuebleService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Inmuebles")
@RequiredArgsConstructor
public class InmuebleController {

    private final InmuebleService inmuebleService;

    @PostMapping()
    public InmuebleVillaDTO save(@Validated @RequestBody InmuebleEntity inmuebleEntity) {
        return inmuebleService.save(inmuebleEntity);
    }

    @GetMapping
    public List<ClienteEntity> getAll() {
        return inmuebleService.getAll();
    }

    @GetMapping("/{id}")
    public ClienteEntity getById(@PathVariable Integer id) {
        return clienteService.getById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable Integer id) {
        return inmuebleService.deleteById(id);
    }
}
