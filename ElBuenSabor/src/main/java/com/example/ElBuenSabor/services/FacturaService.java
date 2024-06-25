package com.example.ElBuenSabor.services;

import com.example.ElBuenSabor.entities.Factura;
import com.example.ElBuenSabor.repositories.FacturaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaService extends BaseService<Factura, Long> {

    public FacturaService(FacturaRepository facturaRepository) {super(facturaRepository);}

    @Autowired
    private FacturaRepository facturaRepository;


    /*
    @Transactional
    public List<Factura> getFacturaByPedidoId(Long pedidoId) throws Exception{
        try {
            return facturaRepository.getFacturaByPedidoId(pedidoId);
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

     */
}
