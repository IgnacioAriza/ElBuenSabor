package com.example.ElBuenSabor.services;

import com.example.ElBuenSabor.entities.ArticuloInsumo;
import com.example.ElBuenSabor.repositories.ArticuloInsumoRepository;
import org.springframework.stereotype.Service;

@Service
public class ArticuloInsumoService extends BaseService<ArticuloInsumo, Long> {

    public ArticuloInsumoService(ArticuloInsumoRepository articuloInsumoRepository){
        super(articuloInsumoRepository);
    }

}
