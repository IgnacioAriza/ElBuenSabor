package com.example.ElBuenSabor.controllers;

import com.example.ElBuenSabor.entities.Pais;
import com.example.ElBuenSabor.services.PaisService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paises")
public class PaisController extends BaseController<Pais, Long> {

    public PaisController(PaisService paisService){
        super(paisService);
    }

}
