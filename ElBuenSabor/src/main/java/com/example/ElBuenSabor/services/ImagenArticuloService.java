package com.example.ElBuenSabor.services;

import com.example.ElBuenSabor.entities.ImagenArticulo;
import com.example.ElBuenSabor.repositories.ImagenArticuloRepository;
import org.springframework.stereotype.Service;

@Service
public class ImagenArticuloService extends BaseService<ImagenArticulo, Long> {

    public ImagenArticuloService(ImagenArticuloRepository imagenArticuloRepository){
        super(imagenArticuloRepository);
    }

}
