package com.example.ElBuenSabor.services;

import com.example.ElBuenSabor.entities.Categoria;
import com.example.ElBuenSabor.entities.Sucursal;
import com.example.ElBuenSabor.repositories.SucursalRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SucursalService extends BaseService<Sucursal, Long> {

    public SucursalService(SucursalRepository sucursalRepository){
        super(sucursalRepository);
    }

    @Autowired
    private SucursalRepository sucursalRepository;

    @Transactional
    public List<Sucursal> getSucursalByEmpresaId(Long empresaId){
        return sucursalRepository.findByEmpresaId(empresaId);
    }


    @Transactional
    public List<Categoria> getCategoriaBySucursal(Long sucursalId) throws Exception{
        try {
            Sucursal sucursal = sucursalRepository.findById(sucursalId).orElse(null);
            return new ArrayList<>(sucursal.getCategorias());
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

}
