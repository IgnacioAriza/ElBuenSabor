package com.example.ElBuenSabor.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "categoria")

public class Categoria extends Base{
    private String denominacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoria_id", referencedColumnName = "id")
    private Categoria categoria;

    @OneToMany
    @JoinColumn(name = "categoria_id", referencedColumnName = "id")
    private List<Categoria> categorias;

    @OneToMany
    @JoinColumn(name = "articulo_id", referencedColumnName = "id")
    private List<Articulo> articulos;


    /*
    @OneToMany(mappedBy = "categoriaPadre")
    @Builder.Default
    private Set<Categoria> subcategorias = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "categoria_padre_id")
    @JsonIgnore //Impide que se genere un bucle en la llamada GET
    private Categoria categoriaPadre;

     */
}
