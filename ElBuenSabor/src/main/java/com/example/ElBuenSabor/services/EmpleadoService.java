package com.example.ElBuenSabor.services;

import com.example.ElBuenSabor.entities.Empleado;
import com.example.ElBuenSabor.repositories.EmpleadoRepository;
import com.example.ElBuenSabor.repositories.SucursalRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService extends BaseService<Empleado, Long>{

    public EmpleadoService(EmpleadoRepository empleadoRepository){
        super(empleadoRepository);
    }

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Transactional
    public List<Empleado> getEmpleadoBySucursalId(Long sucursalId) throws Exception{
        try {
            return empleadoRepository.findBySucursalId(sucursalId);
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
