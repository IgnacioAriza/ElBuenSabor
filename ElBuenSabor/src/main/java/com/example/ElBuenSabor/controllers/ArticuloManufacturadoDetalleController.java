package com.example.ElBuenSabor.controllers;

import com.example.ElBuenSabor.entities.ArticuloManufacturadoDetalle;
import com.example.ElBuenSabor.entities.Factura;
import com.example.ElBuenSabor.services.ArticuloManufacturadoDetalleService;
import com.example.ElBuenSabor.services.ArticuloManufacturadoService;
import com.example.ElBuenSabor.services.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/articulo-manufacturado-detalle")
public class ArticuloManufacturadoDetalleController extends BaseController<ArticuloManufacturadoDetalle, Long> {

    public ArticuloManufacturadoDetalleController(ArticuloManufacturadoDetalleService articuloManufacturadoDetalleService){
        super(articuloManufacturadoDetalleService);
    }

    @Autowired
    private ArticuloManufacturadoDetalleService articuloManufacturadoDetalleService;

    @GetMapping("/articulo-insumo/{articuloInsumoId}")
    public List<ArticuloManufacturadoDetalle> getArticuloManufacturadoDetalleByArticuloInsumoId(@PathVariable Long articuloInsumoId) throws Exception{
        return articuloManufacturadoDetalleService.getArticuloManufacturadoDetalleByArticuloInsumoId(articuloInsumoId);
    }

    @GetMapping("/articulo-manufacturado/{articuloManufacturadoId}")
    public List<ArticuloManufacturadoDetalle> getArticuloManufacturadoDetalleByArticuloManufacturadoId(@PathVariable Long articuloManufacturadoId) throws Exception{
        return articuloManufacturadoDetalleService.getArticuloManufacturadoDetalleByArticuloManufacturadoId(articuloManufacturadoId);
    }

}
