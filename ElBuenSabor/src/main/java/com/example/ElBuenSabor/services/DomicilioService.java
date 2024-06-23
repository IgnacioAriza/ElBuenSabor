package com.example.ElBuenSabor.services;

import com.example.ElBuenSabor.entities.Domicilio;
import com.example.ElBuenSabor.repositories.DomicilioRepository;
import org.springframework.stereotype.Service;

@Service
public class DomicilioService extends BaseService<Domicilio, Long> {

    public DomicilioService(DomicilioRepository domicilioRepository){
        super(domicilioRepository);
    }

}
