package com.example.ElBuenSabor.controllers;

import com.example.ElBuenSabor.entities.ArticuloManufacturado;
import com.example.ElBuenSabor.services.ArticuloManufacturadoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/articulo-manufacturado")
public class ArticuloManufacturadoController extends BaseController<ArticuloManufacturado, Long> {

    public ArticuloManufacturadoController(ArticuloManufacturadoService articuloManufacturadoService){
        super(articuloManufacturadoService);
    }

}
