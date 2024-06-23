package com.example.ElBuenSabor.repositories;

import com.example.ElBuenSabor.entities.DetallePedido;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetallePedidoRepository extends BaseRepository<DetallePedido, Long> {

    List<DetallePedido> findAllByPedidoId(Long idPedido);

}
