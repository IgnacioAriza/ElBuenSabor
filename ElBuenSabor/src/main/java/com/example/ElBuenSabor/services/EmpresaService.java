package com.example.ElBuenSabor.services;

import com.example.ElBuenSabor.entities.Empresa;
import com.example.ElBuenSabor.repositories.EmpresaRepository;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService extends BaseService<Empresa, Long> {

    public EmpresaService(EmpresaRepository empresaRepository){
        super(empresaRepository);
    }

}
