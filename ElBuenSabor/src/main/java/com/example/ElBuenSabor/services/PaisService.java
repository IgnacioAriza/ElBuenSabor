package com.example.ElBuenSabor.services;

import com.example.ElBuenSabor.entities.Pais;
import com.example.ElBuenSabor.repositories.PaisRepository;
import org.springframework.stereotype.Service;

@Service
public class PaisService extends BaseService<Pais, Long> {

    public PaisService(PaisRepository paisRepository){
        super(paisRepository);
    }

}
