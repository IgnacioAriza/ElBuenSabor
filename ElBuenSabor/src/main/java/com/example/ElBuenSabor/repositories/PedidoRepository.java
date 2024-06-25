package com.example.ElBuenSabor.repositories;

import com.example.ElBuenSabor.entities.Empleado;
import com.example.ElBuenSabor.entities.Pedido;
import com.example.ElBuenSabor.entities.Sucursal;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends BaseRepository<Pedido, Long> {

    List<Pedido> getPedidoByClienteId(Long clientesId);

    List<Pedido> getPedidoByEmpleadoId(Long empleadosId);

    List<Pedido> getPedidoBySucursalId(Long sucursalesId);
}
