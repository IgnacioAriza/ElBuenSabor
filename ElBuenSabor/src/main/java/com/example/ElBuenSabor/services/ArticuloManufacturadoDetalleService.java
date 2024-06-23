package com.example.ElBuenSabor.services;

import com.example.ElBuenSabor.entities.ArticuloManufacturadoDetalle;
import com.example.ElBuenSabor.repositories.ArticuloManufacturadoDetalleRepository;
import org.springframework.stereotype.Service;

@Service
public class ArticuloManufacturadoDetalleService extends BaseService<ArticuloManufacturadoDetalle, Long> {

    public ArticuloManufacturadoDetalleService(ArticuloManufacturadoDetalleRepository articuloManufacturadoDetalleRepository){
        super(articuloManufacturadoDetalleRepository);
    }

}
