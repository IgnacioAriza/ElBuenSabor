package com.example.ElBuenSabor.repositories;

import com.example.ElBuenSabor.entities.Empleado;
import com.example.ElBuenSabor.entities.Sucursal;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpleadoRepository extends BaseRepository<Empleado, Long> {
    List<Empleado> findBySucursalId(Long sucursalId);
}
