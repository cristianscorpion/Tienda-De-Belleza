package com.example.tiendaBelleza.controller;

import com.example.tiendaBelleza.dto.BodegaDto;
import com.example.tiendaBelleza.dto.ProductoDto;
import com.example.tiendaBelleza.service.BodegaService;
import com.example.tiendaBelleza.service.ProductoService;
import com.example.tiendaBelleza.utils.Constants;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/producto")
@RestController
@CrossOrigin(origins = "*")
public class ProductoController {
    @Autowired
    ProductoService productoService;

    @Autowired
    BodegaService bodegaService;

    @RequestMapping(Constants.GET_PRODUCT_BY_CODE)
    public ProductoDto getProductByCode(@PathVariable Integer codigoProducto) {
        return productoService.getProductByCode(codigoProducto);
    }

    @RequestMapping(Constants.GET_ALL_PRODUCTS)
    public List<ProductoDto> getAllProducts() {
        return productoService.getAllProducts();
    }

    @RequestMapping(value= Constants.SAVE_PRODUCT, method= RequestMethod.POST)
    public void saveProduct(@RequestBody ProductoDto productoDto) {
        productoService.saveProduct(productoDto);
    }

    @RequestMapping(Constants.GET_ALL_BODEGAS)
    public List<BodegaDto> getAllBodegas() {
        return bodegaService.getAllBodegas();
    }

}
