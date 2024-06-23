package com.example.ElBuenSabor.controllers;

import com.example.ElBuenSabor.entities.ImagenPromocion;
import com.example.ElBuenSabor.services.ImagenPromocionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("imagen-promocion")
public class ImagenPromocionController extends BaseController<ImagenPromocion, Long>{

    public ImagenPromocionController(ImagenPromocionService imagenPromocionService){
        super(imagenPromocionService);
    }

}
