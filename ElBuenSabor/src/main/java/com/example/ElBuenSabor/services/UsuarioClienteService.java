package com.example.ElBuenSabor.services;

import com.example.ElBuenSabor.entities.UsuarioCliente;
import com.example.ElBuenSabor.repositories.UsuarioClienteRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioClienteService extends BaseService<UsuarioCliente, Long> {

    public UsuarioClienteService(UsuarioClienteRepository usuarioClienteRepository){
        super(usuarioClienteRepository);
    }

}
