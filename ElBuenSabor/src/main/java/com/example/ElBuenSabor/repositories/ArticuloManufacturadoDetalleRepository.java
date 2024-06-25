package com.example.ElBuenSabor.repositories;

import com.example.ElBuenSabor.entities.ArticuloManufacturadoDetalle;
import com.example.ElBuenSabor.entities.Factura;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticuloManufacturadoDetalleRepository extends BaseRepository<ArticuloManufacturadoDetalle, Long> {

    List<ArticuloManufacturadoDetalle> getArticuloManufacturadoDetalleByArticuloInsumoId(Long articuloInsumoId);

    List<ArticuloManufacturadoDetalle> getArticuloManufacturadoDetalleByArticuloManufacturadoId(Long articuloManufacturadoId);


}
