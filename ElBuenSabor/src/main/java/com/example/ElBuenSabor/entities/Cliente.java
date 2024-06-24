package com.example.ElBuenSabor.entities;

import com.example.ElBuenSabor.entities.enums.Rol;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "clientes")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Cliente extends Base {

    @Column(name = "nombre_cliente")
    private String nombre;

    @Column(name = "apellido_cliente")
    private String apellido;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "email")
    private String email;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    @Column(name = "rol")
    private Rol rol;

    @ManyToMany
    @JoinTable(name = "cliente_domicilio",
            joinColumns = @JoinColumn(name = "cliente_id"),
            inverseJoinColumns = @JoinColumn(name = "domicilio_id"))
    @Builder.Default
    private Set<Domicilio> domicilios = new HashSet<>();

    @OneToOne
    private ImagenCliente imagenCliente;

    @OneToOne
    private UsuarioCliente usuarioCliente;

}
