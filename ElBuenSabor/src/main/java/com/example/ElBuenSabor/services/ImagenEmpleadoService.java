package com.example.ElBuenSabor.services;

import com.example.ElBuenSabor.entities.ImagenEmpleado;
import com.example.ElBuenSabor.repositories.ImagenEmpleadoRepository;
import org.springframework.stereotype.Service;

@Service
public class ImagenEmpleadoService extends BaseService<ImagenEmpleado, Long> {

    public ImagenEmpleadoService(ImagenEmpleadoRepository imagenEmpleadoRepository){
        super(imagenEmpleadoRepository);
    }

}
