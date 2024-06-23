package com.example.ElBuenSabor.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

//@MappedSuperclass
@Entity
@Table(name = "articulos")
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Inheritance(strategy = InheritanceType.JOINED)

public abstract class Articulo extends Base{
    protected String denominación;
    protected Double precioVenta;

    @ManyToOne
    @JoinColumn(name = "unidad_medida_id", referencedColumnName = "id")
    private UnidadMedida unidadMedida;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    protected Categoria categoria;

    @OneToMany(mappedBy = "articulo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ImagenArticulo> imagenesArticulo;


}
