package com.filtrofinal.ProyectoFiltro.Controllers;

import com.filtrofinal.ProyectoFiltro.Repositories.Entities.ClienteEntity;
import com.filtrofinal.ProyectoFiltro.Services.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clientes")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService clienteService;

    @PostMapping
    public ClienteEntity save(@Validated @RequestBody ClienteEntity clienteEntity) {
        return clienteService.save(clienteEntity);
    }

    @GetMapping
    public List<ClienteEntity> getAll() {
        return clienteService.getAll();
    }

    @GetMapping("/{id}")
    public ClienteEntity getById(@PathVariable Integer id) {
        return clienteService.getById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable Integer id) {
        return clienteService.deleteById(id);
    }
}
