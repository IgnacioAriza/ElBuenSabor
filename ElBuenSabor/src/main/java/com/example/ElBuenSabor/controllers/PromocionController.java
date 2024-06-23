package com.example.ElBuenSabor.controllers;

import com.example.ElBuenSabor.entities.Promocion;
import com.example.ElBuenSabor.services.PromocionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/promociones")
public class PromocionController extends BaseController<Promocion, Long> {

    public PromocionController(PromocionService promocionService){
        super(promocionService);
    }

}
