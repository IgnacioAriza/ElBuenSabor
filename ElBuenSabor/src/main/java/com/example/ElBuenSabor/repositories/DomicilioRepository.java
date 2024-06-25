package com.example.ElBuenSabor.repositories;

import com.example.ElBuenSabor.entities.Domicilio;
import com.example.ElBuenSabor.entities.Localidad;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DomicilioRepository extends BaseRepository<Domicilio, Long> {

    List<Domicilio> getDomicilioByLocalidadId(Long localidadesId);

}
