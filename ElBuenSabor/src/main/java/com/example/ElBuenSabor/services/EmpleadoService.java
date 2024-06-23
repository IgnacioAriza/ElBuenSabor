package com.example.ElBuenSabor.services;

import com.example.ElBuenSabor.entities.Empleado;
import com.example.ElBuenSabor.repositories.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService extends BaseService<Empleado, Long>{

    public EmpleadoService(EmpleadoRepository empleadoRepository){
        super(empleadoRepository);
    }

}
