package com.example.ElBuenSabor.controllers;

import com.example.ElBuenSabor.entities.Categoria;
import com.example.ElBuenSabor.entities.Empresa;
import com.example.ElBuenSabor.entities.Sucursal;
import com.example.ElBuenSabor.services.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sucursales")
public class SucursalController extends BaseController<Sucursal, Long> {

    public SucursalController(SucursalService sucursalService){
        super(sucursalService);
    }

    @Autowired
    SucursalService sucursalService;

    @GetMapping("/empresas/{empresasId}")
    public List<Sucursal> getSucursalByEmpresaId(@PathVariable Long empresaId) throws Exception{
        return sucursalService.getSucursalByEmpresaId(empresaId);
    }

    @GetMapping("/categorias/{sucursalesId}")
    public List<Categoria> getCategoriaBySucursal(@PathVariable Long sucursalId) throws Exception{
        return sucursalService.getCategoriaBySucursal(sucursalId);
    }

}
