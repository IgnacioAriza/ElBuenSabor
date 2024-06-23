package com.example.ElBuenSabor.entities;

import com.example.ElBuenSabor.entities.enums.Rol;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "empleados")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Empleado extends Base{

    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private LocalDate fechaNacimiento;
    private Rol rol;

    @ManyToOne
    @JoinColumn(name = "sucursal_id")
    private Sucursal sucursal;

    @OneToOne
    @JoinColumn(name = "imagen_empleado_id")
    private ImagenEmpleado imagenEmpleado;

    @OneToOne
    private UsuarioEmpleado usuarioEmpleado;


}
