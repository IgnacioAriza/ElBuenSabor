package com.example.ElBuenSabor.controllers;

import com.example.ElBuenSabor.entities.ImagenArticulo;
import com.example.ElBuenSabor.services.ImagenArticuloService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("imagen-articulo")
public class ImagenArticuloController extends BaseController<ImagenArticulo, Long>{

    public ImagenArticuloController(ImagenArticuloService imagenArticuloService){
        super(imagenArticuloService);
    }

}
