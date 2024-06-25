package com.example.ElBuenSabor.repositories;

import com.example.ElBuenSabor.entities.Factura;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FacturaRepository extends BaseRepository<Factura, Long>{

    //List<Factura> getFacturaByPedidoId(Long pedidoId);

}
