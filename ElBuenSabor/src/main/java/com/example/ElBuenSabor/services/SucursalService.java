package com.example.ElBuenSabor.services;

import com.example.ElBuenSabor.entities.Sucursal;
import com.example.ElBuenSabor.repositories.SucursalRepository;
import org.springframework.stereotype.Service;

@Service
public class SucursalService extends BaseService<Sucursal, Long> {

    public SucursalService(SucursalRepository sucursalRepository){
        super(sucursalRepository);
    }

}
