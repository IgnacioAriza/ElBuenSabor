package com.example.ElBuenSabor.repositories;

import com.example.ElBuenSabor.entities.Categoria;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends BaseRepository<Categoria, Long> {

    List<Categoria> findAllByCategoriaPadre_Id(Long idCategoriaPadre);

}