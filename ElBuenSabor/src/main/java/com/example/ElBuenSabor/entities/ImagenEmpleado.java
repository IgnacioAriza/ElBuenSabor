package com.example.ElBuenSabor.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ImagenEmpleado extends Base{

    private String denominacion;

    @OneToOne
    @JoinColumn(name = "empleado_id", referencedColumnName = "id")
    private Empleado empleado;



}
