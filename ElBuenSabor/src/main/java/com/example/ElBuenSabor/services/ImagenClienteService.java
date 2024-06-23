package com.example.ElBuenSabor.services;

import com.example.ElBuenSabor.entities.ImagenCliente;
import com.example.ElBuenSabor.entities.ImagenCliente;
import com.example.ElBuenSabor.repositories.ImagenClienteRepository;
import org.springframework.stereotype.Service;

@Service
public class ImagenClienteService extends BaseService<ImagenCliente, Long> {

    public ImagenClienteService(ImagenClienteRepository imagenClienteRepository){
        super(imagenClienteRepository);
    }

}
