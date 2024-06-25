package com.example.ElBuenSabor.services;

import com.example.ElBuenSabor.entities.ArticuloManufacturadoDetalle;
import com.example.ElBuenSabor.entities.Factura;
import com.example.ElBuenSabor.repositories.ArticuloManufacturadoDetalleRepository;
import com.example.ElBuenSabor.repositories.FacturaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticuloManufacturadoDetalleService extends BaseService<ArticuloManufacturadoDetalle, Long> {

    public ArticuloManufacturadoDetalleService(ArticuloManufacturadoDetalleRepository articuloManufacturadoDetalleRepository){
        super(articuloManufacturadoDetalleRepository);
    }

    @Autowired
    private ArticuloManufacturadoDetalleRepository articuloManufacturadoDetalleRepository;


    @Transactional
    public List<ArticuloManufacturadoDetalle> getArticuloManufacturadoDetalleByArticuloInsumoId(Long articuloInsumoId) throws Exception{
        try {
            return articuloManufacturadoDetalleRepository.getArticuloManufacturadoDetalleByArticuloInsumoId(articuloInsumoId);
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<ArticuloManufacturadoDetalle> getArticuloManufacturadoDetalleByArticuloManufacturadoId(Long articuloManufacturadoId) throws Exception{
        try {
            return articuloManufacturadoDetalleRepository.getArticuloManufacturadoDetalleByArticuloManufacturadoId(articuloManufacturadoId);
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
