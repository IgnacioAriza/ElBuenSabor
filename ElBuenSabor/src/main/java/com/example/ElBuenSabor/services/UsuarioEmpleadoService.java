package com.example.ElBuenSabor.services;

import com.example.ElBuenSabor.entities.UsuarioEmpleado;
import com.example.ElBuenSabor.repositories.UsuarioEmpleadoRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioEmpleadoService extends BaseService<UsuarioEmpleado, Long> {

    public UsuarioEmpleadoService(UsuarioEmpleadoRepository usuarioEmpleadoRepository){
        super(usuarioEmpleadoRepository);
    }

}
