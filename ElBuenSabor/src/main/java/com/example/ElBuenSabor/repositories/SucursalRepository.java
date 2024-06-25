package com.example.ElBuenSabor.repositories;

import com.example.ElBuenSabor.entities.Empresa;
import com.example.ElBuenSabor.entities.Sucursal;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SucursalRepository extends BaseRepository<Sucursal, Long> {
    List<Sucursal> findByEmpresaId(Long empresaId);
}
