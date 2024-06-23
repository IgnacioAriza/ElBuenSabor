package com.example.ElBuenSabor.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "articulo_insumo")
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder //o @Builder
public class ArticuloInsumo extends Articulo{
    @Column(name = "precio_compra")
    private Double precioCompra;
    @Column(name = "stock_actual")
    private Integer stockActual;
    @Column(name = "stock_maximo")
    private Integer stockMaximo;
    @Column(name = "es_para_elaborar")
    private  Boolean esParaElaborar;
}
