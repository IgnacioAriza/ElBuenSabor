package com.example.ElBuenSabor.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "articulos_manufacturados_detalle")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ArticuloManufacturadoDetalle extends Base{
    @Column(name = "cantidad")
    private Integer cantidad;

    @ManyToOne
    @JoinColumn(name = "articulo_manufacturado_id")
    private ArticuloManufacturado articuloManufacturado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "articulo_insumo_id")
    private ArticuloInsumo articuloInsumo;
}
