package com.example.ElBuenSabor.controllers;

import com.example.ElBuenSabor.entities.ArticuloManufacturadoDetalle;
import com.example.ElBuenSabor.services.ArticuloManufacturadoDetalleService;
import com.example.ElBuenSabor.services.ArticuloManufacturadoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/articulo-manufacturado-detalle")
public class ArticuloManufacturadoDetalleController extends BaseController<ArticuloManufacturadoDetalle, Long> {

    public ArticuloManufacturadoDetalleController(ArticuloManufacturadoDetalleService articuloManufacturadoDetalleService){
        super(articuloManufacturadoDetalleService);
    }

}
