package com.example.ElBuenSabor.services;

import com.example.ElBuenSabor.entities.Promocion;
import com.example.ElBuenSabor.entities.Sucursal;
import com.example.ElBuenSabor.repositories.PromocionRepository;
import com.example.ElBuenSabor.repositories.SucursalRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PromocionService extends BaseService<Promocion, Long> {

    public PromocionService(PromocionRepository promocionRepository){
        super(promocionRepository);
    }

    @Autowired
    private SucursalRepository sucursalRepository;


    @Transactional
    public List<Promocion> getPromocionBySucursalId(Long sucursalesId) throws Exception{
        try {
            Sucursal sucursal = sucursalRepository.findById(sucursalesId).orElse(null);
            return new ArrayList<>(sucursal.getPromociones());
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

}
