package com.filtrofinal.ProyectoFiltro.Repositories.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Villas")
public class Villa {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "villa_id")
private Integer villa_id;

@Column(name = "urbanziacion")
private String urbanziacion;
@Column(name = "superficie_m2")
private Integer superficie_m2;
@Column(name = "direccion")
private String direccion;
@Column(name = "habitaciones")
private Integer habitaciones;
@Column(name = "baños")
private Integer baños;
@Column(name = "aseos")
private Integer aseos;
@Column(name = "cocinas")
private Integer cocinas;
@Column(name = "gas")
private boolean gas;
@Column(name = "ciudad")
private String ciudad;
@Column(name = "puerta_blindada")
private boolean puerta_blindada;
@Column(name = "parqueadero")
private boolean parqueadero;
@Column(name = "zona")
private String zona;

}
