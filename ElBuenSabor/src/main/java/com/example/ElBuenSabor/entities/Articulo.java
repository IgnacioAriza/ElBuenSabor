package com.example.ElBuenSabor.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

//@MappedSuperclass
@Entity
//@Table(name = "articulos")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Inheritance(strategy = InheritanceType.JOINED)

public abstract class Articulo extends Base{
    protected String denominación;
    protected Double precioVenta;

    @OneToMany
    @Builder.Default
    protected Set<ImagenArticulo> imagenArticulo = new HashSet<>();


    @ManyToOne
    @JoinColumn(name = "categoria_id")
    protected Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "unidad_medida_id")
    protected UnidadMedida unidadMedida;
/*
    @ManyToOne
    @JoinColumn(name = "unidad_medida_id")
    protected UnidadMedida unidadMedida;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    protected Categoria categoria;

 */

    //@OneToMany(mappedBy = "articulo", cascade = CascadeType.ALL, orphanRemoval = true)
    //private List<ImagenArticulo> imagenesArticulo;


}
