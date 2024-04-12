package com.filtrofinal.ProyectoFiltro.Repositories.Entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Clientes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cliente_id", nullable = false)
    private Integer cliente_id;
    @Column(name = "nombre", nullable = false)
    private String  nombre;
    @Column(name = "apellido", nullable = false)
    private String  apellido;
    @Column(name = "telefono")
    @Pattern(regexp = "\\d{10}", message = "el teléfono del socio debe contener 10 dígitos")
    private String  telefono;
}