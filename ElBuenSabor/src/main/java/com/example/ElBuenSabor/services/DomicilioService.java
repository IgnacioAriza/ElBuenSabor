package com.example.ElBuenSabor.services;

import com.example.ElBuenSabor.entities.Cliente;
import com.example.ElBuenSabor.entities.Domicilio;
import com.example.ElBuenSabor.repositories.DomicilioRepository;
import com.example.ElBuenSabor.repositories.ClienteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DomicilioService extends BaseService<Domicilio, Long> {

    public DomicilioService(DomicilioRepository domicilioRepository){
        super(domicilioRepository);
    }

    @Autowired
    private ClienteRepository clientesRepository;

    @Autowired
    private DomicilioRepository domicilioRepository;

    @Transactional
    public List<Domicilio> getDomicilioByClienteId(Long clientesId) throws Exception{
        try {
            Cliente cliente = clientesRepository.findById(clientesId).orElse(null);
            return new ArrayList<>(cliente.getDomicilios());
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<Domicilio> getDomicilioByLocalidadId(Long localidadesId) throws Exception{
        try {
            return domicilioRepository.getDomicilioByLocalidadId(localidadesId);
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

}
