package com.example.tiendaBelleza.dto;



import java.io.Serializable;

public class ProductoDto implements Serializable {
    private Integer codigoProducto;
    private String nombreProducto;
    private Integer bodegaId;
    private String nombreBodega;

    public Integer getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(Integer codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Integer getBodegaId() {
        return bodegaId;
    }

    public void setBodegaId(Integer bodegaId) {
        this.bodegaId = bodegaId;
    }

    public ProductoDto(){

    }

    public String getNombreBodega() {
        return nombreBodega;
    }

    public void setNombreBodega(String nombreBodega) {
        this.nombreBodega = nombreBodega;
    }

    public ProductoDto(Integer codigoProducto, String nombreProducto, Integer bodegaId) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.bodegaId = bodegaId;
    }
}
