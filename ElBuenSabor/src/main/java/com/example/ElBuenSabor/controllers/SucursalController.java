package com.example.ElBuenSabor.controllers;

import com.example.ElBuenSabor.entities.Sucursal;
import com.example.ElBuenSabor.services.SucursalService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sucursales")
public class SucursalController extends BaseController<Sucursal, Long> {

    public SucursalController(SucursalService sucursalService){
        super(sucursalService);
    }

}
