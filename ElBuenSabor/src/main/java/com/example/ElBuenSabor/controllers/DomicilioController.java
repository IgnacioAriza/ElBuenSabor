package com.example.ElBuenSabor.controllers;

import com.example.ElBuenSabor.entities.Domicilio;
import com.example.ElBuenSabor.services.DomicilioService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/domicilios")
public class DomicilioController extends BaseController<Domicilio, Long> {

    public DomicilioController(DomicilioService domicilioService){
        super(domicilioService);
    }

}
