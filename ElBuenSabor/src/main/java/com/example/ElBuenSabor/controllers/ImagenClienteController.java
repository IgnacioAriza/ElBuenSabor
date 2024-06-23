package com.example.ElBuenSabor.controllers;

import com.example.ElBuenSabor.entities.ImagenCliente;

import com.example.ElBuenSabor.services.ImagenClienteService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("imagen-cliente")
public class ImagenClienteController extends BaseController<ImagenCliente, Long>{

    public ImagenClienteController(ImagenClienteService imagenClienteService){
        super(imagenClienteService);
    }

}
