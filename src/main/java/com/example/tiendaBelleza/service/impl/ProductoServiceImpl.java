package com.example.tiendaBelleza.service.impl;

import com.example.tiendaBelleza.converter.EntityConverter;
import com.example.tiendaBelleza.dto.ProductoDto;
import com.example.tiendaBelleza.repository.ProductoRepository;
import com.example.tiendaBelleza.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    ProductoRepository productoRepository;

    @Override
    public ProductoDto getProductByCode(Integer codigoProducto) {
        return EntityConverter.productoToProductoDto(productoRepository.getOne(codigoProducto));
    }

    @Override
    public void saveProduct(ProductoDto productoDto) {
        productoRepository.save(EntityConverter.productoDtoToProducto(productoDto));
    }

    @Override
    public List<ProductoDto> getAllProducts() {
        return productoRepository.findAll().stream().map(EntityConverter::productoToProductoDto).collect(Collectors.toList());
    }
}
