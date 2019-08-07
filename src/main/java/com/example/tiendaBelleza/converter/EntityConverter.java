package com.example.tiendaBelleza.converter;

import com.example.tiendaBelleza.dto.BodegaDto;
import com.example.tiendaBelleza.dto.ProductoDto;
import com.example.tiendaBelleza.entity.Bodega;
import com.example.tiendaBelleza.entity.Producto;

public class EntityConverter {
    public static Producto productoDtoToProducto(ProductoDto productoDto) {
        Producto producto = new Producto(productoDto.getNombreProducto());
        producto.setCodigoProducto(productoDto.getCodigoProducto());
        Bodega bodega = new Bodega();
        bodega.setCodigoBodega(productoDto.getBodegaId());
        producto.setBodega(bodega);
        return producto;
    }

    public static ProductoDto productoToProductoDto(Producto producto) {
        ProductoDto productoDto = new ProductoDto(producto.getCodigoProducto(),producto.getNombreProducto(),producto.getBodega().getCodigoBodega());
        productoDto.setNombreBodega(producto.getBodega().getNombreBodega());
        return productoDto;
    }

    public static Bodega bodegaDtoToBodega(BodegaDto bodegaDto) {
        Bodega bodega = new Bodega(bodegaDto.getNombreBodega(),bodegaDto.getLocalizacionBodega());
        bodega.setCodigoBodega(bodegaDto.getCodigoBodega());
        return bodega;
    }

    public static BodegaDto bodegaToBodegaDto(Bodega bodega) {
        BodegaDto bodegaDto = new BodegaDto(bodega.getCodigoBodega(),bodega.getNombreBodega(),bodega.getLocalizacionBodega());
        return bodegaDto;
    }
}
