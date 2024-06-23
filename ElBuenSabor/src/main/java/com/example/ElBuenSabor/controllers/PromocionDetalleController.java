package com.example.ElBuenSabor.controllers;

import com.example.ElBuenSabor.entities.PromocionDetalle;
import com.example.ElBuenSabor.services.PromocionDetalleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/promocion-detalle")
public class PromocionDetalleController extends BaseController<PromocionDetalle, Long> {

    public PromocionDetalleController(PromocionDetalleService promocionDetalleService){
        super(promocionDetalleService);
    }

}
