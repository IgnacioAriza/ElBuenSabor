package com.example.ElBuenSabor.controllers;

import com.example.ElBuenSabor.entities.Factura;
import com.example.ElBuenSabor.services.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/facturas")
public class FacturaController extends BaseController<Factura, Long> {

    public FacturaController(FacturaService facturaService) {super(facturaService);}

    @Autowired
    private FacturaService facturaService;

    /*
    @GetMapping("/pedidos/{pedidoId}")
    public List<Factura> getFacturaByPedidoId(@PathVariable Long pedidoId) throws Exception{
        return facturaService.getFacturaByPedidoId(pedidoId);
    }

     */

}
