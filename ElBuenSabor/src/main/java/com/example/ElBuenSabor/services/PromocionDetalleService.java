package com.example.ElBuenSabor.services;

import com.example.ElBuenSabor.entities.PromocionDetalle;
import com.example.ElBuenSabor.repositories.PromocionDetalleRepository;
import org.springframework.stereotype.Service;

@Service
public class PromocionDetalleService extends BaseService<PromocionDetalle, Long> {

    public PromocionDetalleService(PromocionDetalleRepository promocionDetalleRepository){
        super(promocionDetalleRepository);
    }

}
