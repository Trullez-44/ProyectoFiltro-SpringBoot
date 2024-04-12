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
    @Column(name = "tipo_inmueble")
    private String tipo;
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
    @OneToOne
    @JoinColumn(name = "villa", referencedColumnName = "villa_id")
    private Villa villa_id;
}
