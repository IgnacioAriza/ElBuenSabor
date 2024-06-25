package com.example.ElBuenSabor.controllers;

import com.example.ElBuenSabor.entities.Empleado;
import com.example.ElBuenSabor.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController extends BaseController<Empleado, Long> {

    public EmpleadoController(EmpleadoService empleadoService){
        super(empleadoService);
    }

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping("/sucursales/{sucursalesId}")
    public List<Empleado> getEmpleadoBySucursalId(@PathVariable Long sucursalesId) throws Exception{
        return empleadoService.getEmpleadoBySucursalId(sucursalesId);
    }

}
