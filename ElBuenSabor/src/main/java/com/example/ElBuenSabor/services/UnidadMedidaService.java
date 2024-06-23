package com.example.ElBuenSabor.services;

import com.example.ElBuenSabor.entities.UnidadMedida;
import com.example.ElBuenSabor.repositories.UnidadMedidaRepository;
import org.springframework.stereotype.Service;

@Service
public class UnidadMedidaService extends BaseService<UnidadMedida, Long> {

    public UnidadMedidaService(UnidadMedidaRepository unidadMedidaRepository){
        super(unidadMedidaRepository);
    }

}
