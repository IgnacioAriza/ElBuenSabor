package com.example.ElBuenSabor.controllers;

import com.example.ElBuenSabor.entities.Factura;
import com.example.ElBuenSabor.services.FacturaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/facturas")
public class FacturaController extends BaseController<Factura, Long> {

    public FacturaController(FacturaService facturaService) {super(facturaService);}

}
