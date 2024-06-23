package com.example.ElBuenSabor.services;

import com.example.ElBuenSabor.entities.ArticuloManufacturado;
import com.example.ElBuenSabor.repositories.ArticuloManufacturadoRepository;
import org.springframework.stereotype.Service;

@Service
public class ArticuloManufacturadoService extends BaseService<ArticuloManufacturado, Long> {

    public ArticuloManufacturadoService(ArticuloManufacturadoRepository articuloManufacturadoRepository){
        super(articuloManufacturadoRepository);
    }

}
