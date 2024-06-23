package com.example.ElBuenSabor.controllers;

import com.example.ElBuenSabor.entities.UsuarioEmpleado;
import com.example.ElBuenSabor.services.UsuarioEmpleadoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario-empleado")
public class UsuarioEmpleadoController extends BaseController<UsuarioEmpleado, Long> {

    public UsuarioEmpleadoController(UsuarioEmpleadoService usuarioEmpleadoService){
        super(usuarioEmpleadoService);
    }

}
