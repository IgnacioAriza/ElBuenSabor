package com.example.ElBuenSabor.controllers;

import com.example.ElBuenSabor.entities.Localidad;
import com.example.ElBuenSabor.services.LocalidadService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/localidades")
public class LocalidadController extends BaseController<Localidad, Long> {

    public LocalidadController(LocalidadService localidadService){
        super(localidadService);
    }

}
