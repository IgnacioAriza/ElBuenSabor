package com.example.ElBuenSabor.controllers;

import com.example.ElBuenSabor.entities.Domicilio;
import com.example.ElBuenSabor.services.ClienteService;
import com.example.ElBuenSabor.services.DomicilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/domicilios")
public class DomicilioController extends BaseController<Domicilio, Long> {

    @Autowired
    private DomicilioService domicilioService;

    @Autowired
    private ClienteService clienteService;

    public DomicilioController(DomicilioService domicilioService){
        super(domicilioService);
    }

    @GetMapping("/clientes/{clientesId}")
    public ResponseEntity<List<Domicilio>> getDomicilioByClienteId(@PathVariable Long clientesId) throws Exception{
        List<Domicilio> domicilios = domicilioService.getDomicilioByClienteId(clientesId);
        return ResponseEntity.ok(domicilios);
    }

    @GetMapping("/localidades/{localidadesId}")
    public List<Domicilio> getDomicilioByLocalidadId(@PathVariable Long localidadesId) throws Exception{
        return domicilioService.getDomicilioByLocalidadId(localidadesId);
    }


}
