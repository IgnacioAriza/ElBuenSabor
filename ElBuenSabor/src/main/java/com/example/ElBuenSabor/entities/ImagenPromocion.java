package com.example.ElBuenSabor.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ImagenPromocion extends Base{

    private String denominacion;

    @ManyToOne
    @JoinColumn(name = "promocion_id", referencedColumnName = "id")
    private Promocion promocion;
}
