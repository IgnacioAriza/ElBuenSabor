package com.example.ElBuenSabor.services;

import com.example.ElBuenSabor.entities.ImagenPromocion;
import com.example.ElBuenSabor.repositories.ImagenPromocionRepository;
import org.springframework.stereotype.Service;

@Service
public class ImagenPromocionService extends BaseService<ImagenPromocion, Long> {

    public ImagenPromocionService(ImagenPromocionRepository imagenPromocionRepository){
        super(imagenPromocionRepository);
    }

}
