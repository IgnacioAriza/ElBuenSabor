package com.example.ElBuenSabor.controllers;

import com.example.ElBuenSabor.entities.ImagenEmpleado;

import com.example.ElBuenSabor.services.ImagenEmpleadoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("imagen-empleado")
public class ImagenEmpleadoController extends BaseController<ImagenEmpleado, Long>{

    public ImagenEmpleadoController(ImagenEmpleadoService imagenEmpleadoService){
        super(imagenEmpleadoService);
    }

}
