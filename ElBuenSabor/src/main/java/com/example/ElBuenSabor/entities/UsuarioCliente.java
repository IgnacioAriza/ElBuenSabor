package com.example.ElBuenSabor.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuario-cliente")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioCliente extends Base{

    private String auth0Id;
    private String username;

    @OneToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

}