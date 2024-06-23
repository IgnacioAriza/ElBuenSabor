package com.example.ElBuenSabor.services;

import com.example.ElBuenSabor.entities.Localidad;
import com.example.ElBuenSabor.repositories.LocalidadRepository;
import org.springframework.stereotype.Service;

@Service
public class LocalidadService extends BaseService<Localidad, Long> {

    public LocalidadService(LocalidadRepository localidadRepository){
        super(localidadRepository);
    }

}
