package com.example.ElBuenSabor.services;

import com.example.ElBuenSabor.entities.Cliente;
import com.example.ElBuenSabor.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService extends BaseService<Cliente, Long> {

    public ClienteService(ClienteRepository clienteRepository){
        super(clienteRepository);
    }

}
