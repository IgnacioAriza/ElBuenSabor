package com.example.ElBuenSabor.services;

import com.example.ElBuenSabor.entities.Promocion;
import com.example.ElBuenSabor.repositories.PromocionRepository;
import org.springframework.stereotype.Service;

@Service
public class PromocionService extends BaseService<Promocion, Long> {

    public PromocionService(PromocionRepository promocionRepository){
        super(promocionRepository);
    }

}
