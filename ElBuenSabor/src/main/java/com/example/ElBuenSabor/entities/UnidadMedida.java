package com.example.ElBuenSabor.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "unidad_medida")
public class UnidadMedida extends Articulo{
    @Column(name = "denominacion")
    public String denominacion;

    @OneToMany(mappedBy = "unidadMedida")
    private List<Articulo> articulos;
}
