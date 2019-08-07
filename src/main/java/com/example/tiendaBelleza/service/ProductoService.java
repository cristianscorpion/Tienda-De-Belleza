package com.example.tiendaBelleza.service;

import com.example.tiendaBelleza.dto.ProductoDto;

import java.util.List;

public interface ProductoService {
    ProductoDto getProductByCode(Integer codigoProducto);
    void saveProduct(ProductoDto productoDto);
    List<ProductoDto> getAllProducts();
}
