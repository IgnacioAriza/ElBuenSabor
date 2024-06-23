package com.example.ElBuenSabor.controllers;

import com.example.ElBuenSabor.entities.Provincia;
import com.example.ElBuenSabor.services.ProvinciaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provincias")
public class ProvinciaController extends BaseController<Provincia, Long> {

    public ProvinciaController(ProvinciaService provinciaService){
        super(provinciaService);
    }

}
