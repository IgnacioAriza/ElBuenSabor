package com.example.ElBuenSabor.controllers;

import com.example.ElBuenSabor.entities.Factura;
import com.example.ElBuenSabor.entities.Pedido;
import com.example.ElBuenSabor.services.FacturaService;
import com.example.ElBuenSabor.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pedidos")
public class PedidoController extends BaseController<Pedido, Long> {

    @Autowired
    private PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService){
        super(pedidoService);
    }

    @PutMapping("/total")
    public Optional<Pedido> calcularTotal(@RequestBody Pedido pedido) throws Exception {
        Pedido pedido_aux = pedidoService.calcularTotal(pedido);
        return Optional.ofNullable(pedido_aux);
    }

    @GetMapping("/clientes/{clientesId}")
    public List<Pedido> getPedidoByClienteId(@PathVariable Long clientesId) throws Exception{
        return pedidoService.getPedidoByClienteId(clientesId);
    }

    @GetMapping("/empleados/{empleadosId}")
    public List<Pedido> getPedidoByEmpleadoId(@PathVariable Long empleadosId) throws Exception{
        return pedidoService.getPedidoByEmpleadoId(empleadosId);
    }

    @GetMapping("/sucursales/{sucursalesId}")
    public List<Pedido> getPedidoBySucursalId(@PathVariable Long sucursalesId) throws Exception{
        return pedidoService.getPedidoBySucursalId(sucursalesId);
    }
}
