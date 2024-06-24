package com.example.ElBuenSabor.services;

import com.example.ElBuenSabor.entities.Factura;
import com.example.ElBuenSabor.repositories.FacturaRepository;
import org.springframework.stereotype.Service;

@Service
public class FacturaService extends BaseService<Factura, Long> {

    public FacturaService(FacturaRepository facturaRepository) {super(facturaRepository);}
}
