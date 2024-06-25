package com.example.ElBuenSabor.controllers;

import com.example.ElBuenSabor.entities.Promocion;
import com.example.ElBuenSabor.services.PromocionService;
import com.example.ElBuenSabor.services.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/promociones")
public class PromocionController extends BaseController<Promocion, Long> {

    @Autowired
    private PromocionService promocionService;

    public PromocionController(PromocionService promocionService){
        super(promocionService);
    }

    @Autowired
    private SucursalService sucursalService;

    @GetMapping("/sucursales/{sucursalesId}")
    public ResponseEntity<List<Promocion>> getPromocionBySucursalId(@PathVariable Long sucursalesid) throws Exception{
        List<Promocion> promociones = promocionService.getPromocionBySucursalId(sucursalesid);
        return ResponseEntity.ok(promociones);
    }
}
