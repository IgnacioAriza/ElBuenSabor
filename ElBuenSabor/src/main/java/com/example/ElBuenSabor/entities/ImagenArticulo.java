package com.example.ElBuenSabor.entities;

import jakarta.persistence.Column;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "imagen_articulo")
public class ImagenArticulo extends Articulo{
    @Column(name = "denominacion")
    private String denominacion;

    @ManyToOne
    @JoinColumn(name = "articulo_id", referencedColumnName = "id")
    private Articulo articulo;
}
