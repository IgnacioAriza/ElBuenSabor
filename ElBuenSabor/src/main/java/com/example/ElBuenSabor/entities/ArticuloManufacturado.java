package com.example.ElBuenSabor.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "articulos_manufacturados")
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder //@Builder?
public class ArticuloManufacturado extends Articulo{
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "tiempo_estimado_minutos")
    private Integer tiempoEstimadoMinutos;
    @Column(name = "preparacion")
    private String preparacion;

    //sera que esto es de bidireccional?
    //@OneToMany(mappedBy = "articuloManufacturado", cascade = CascadeType.ALL, orphanRemoval = true)
    //@Builder.Default
    //private List<ArticuloManufacturadoDetalle> articulosManufacturadosDetalle = new ArrayList<ArticuloManufacturadoDetalle>();
}
