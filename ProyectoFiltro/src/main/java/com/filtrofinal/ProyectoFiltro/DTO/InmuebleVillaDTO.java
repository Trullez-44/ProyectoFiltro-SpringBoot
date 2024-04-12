package com.filtrofinal.ProyectoFiltro.DTO;

import com.filtrofinal.ProyectoFiltro.Repositories.Entities.Villa;
import lombok.Data;

@Data
public class InmuebleVillaDTO {

    private boolean venta;
    private String tipo;
    private boolean alquiler;
    private Integer precio_venta;
    private Integer precio_alquier;
    private String n_referencia;
    private String nombre_propietario;
    private String telefono_cliente;
    private Villa villa;
}
