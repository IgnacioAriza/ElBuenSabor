package com.example.ElBuenSabor.controllers;

import com.example.ElBuenSabor.entities.ArticuloInsumo;
import com.example.ElBuenSabor.services.ArticuloInsumoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/articulo-insumo")
public class ArticuloInsumoController extends BaseController<ArticuloInsumo, Long> {

    public ArticuloInsumoController(ArticuloInsumoService articuloInsumoService){
        super(articuloInsumoService);
    }

}
