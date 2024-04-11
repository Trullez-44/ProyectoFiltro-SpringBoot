package com.filtrofinal.ProyectoFiltro.Repositories.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Inmuebles")
public class InmuebleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inmueble_id")
    private Integer inmueble_id;
    @Column(name = "venta", nullable = false)
    private boolean venta;
    @Column(name = "alquiler", nullable = false)
    private boolean alquiler;
    @Column(name = "precio_venta")
    private Integer precio_venta;
    @Column(name = "precio_alquier")
    private Integer precio_alquier;
    @Column(name = "n_referencia", nullable = false)
    private String n_referencia;
    @Column(name = "nombre_propietario", nullable = false)
    private String nombre_propietario;
    @Column(name = "telefono_cliente", nullable = false)
    private String telefono_cliente;
    @Column(name = "villa_id")
    private Integer villa_id;
    @Column(name = "local_id")
    private Integer local_id;
    @Column(name = "casa_id")
    private Integer casa_id;
    @Column(name = "piso_id")
    private Integer piso_id;
    @Column(name = "oficina_id", nullable = false)
    private Integer oficina_id;
}
