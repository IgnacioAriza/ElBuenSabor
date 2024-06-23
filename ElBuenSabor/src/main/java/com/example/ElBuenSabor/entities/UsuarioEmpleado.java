package com.example.ElBuenSabor.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuario-empleado")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioEmpleado extends Base{

    private String auth0Id;
    private String username;

    @OneToOne
    @JoinColumn(name = "empleado_id")
    private Empleado empleado;

}
