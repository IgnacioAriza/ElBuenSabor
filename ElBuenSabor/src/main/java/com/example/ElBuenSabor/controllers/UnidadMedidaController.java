package com.example.ElBuenSabor.controllers;

import com.example.ElBuenSabor.entities.UnidadMedida;
import com.example.ElBuenSabor.services.UnidadMedidaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/unidad-medida")
public class UnidadMedidaController extends BaseController<UnidadMedida, Long> {

    public UnidadMedidaController(UnidadMedidaService unidadMedidaService){
        super(unidadMedidaService);
    }

}
