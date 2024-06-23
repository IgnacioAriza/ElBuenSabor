package com.example.ElBuenSabor.controllers;

import com.example.ElBuenSabor.entities.UsuarioCliente;
import com.example.ElBuenSabor.services.UsuarioClienteService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario-cliente")
public class UsuarioClienteController extends BaseController<UsuarioCliente, Long> {

    public UsuarioClienteController(UsuarioClienteService usuarioClienteService){
        super(usuarioClienteService);
    }

}
