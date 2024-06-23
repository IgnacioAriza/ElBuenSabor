package com.example.ElBuenSabor.services;

import com.example.ElBuenSabor.entities.Provincia;
import com.example.ElBuenSabor.repositories.ProvinciaRepository;
import org.springframework.stereotype.Service;

@Service
public class ProvinciaService extends BaseService<Provincia, Long> {

    public ProvinciaService(ProvinciaRepository provinciaRepository){
        super(provinciaRepository);
    }

}
