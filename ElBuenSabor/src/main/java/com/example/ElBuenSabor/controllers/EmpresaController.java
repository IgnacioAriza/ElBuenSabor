package com.example.ElBuenSabor.controllers;

import com.example.ElBuenSabor.entities.Empresa;
import com.example.ElBuenSabor.services.EmpresaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empresas")
public class EmpresaController extends BaseController<Empresa, Long> {

    public EmpresaController(EmpresaService empresaService){
        super(empresaService);
    }

}
