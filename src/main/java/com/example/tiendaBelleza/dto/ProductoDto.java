package com.example.tiendaBelleza.dto;



import java.io.Serializable;

public class ProductoDto implements Serializable {
    private Integer codigoProducto;
    private String nombreProducto;
    private Integer bodegaId;
    private String nombreBodega;
    private Double precioProducto;
    private Integer unidadesDisponibles;
    private String tipoProducto;

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

    public Double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(Double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public Integer getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(Integer unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public ProductoDto(){

    }

    public String getNombreBodega() {
        return nombreBodega;
    }

    public void setNombreBodega(String nombreBodega) {
        this.nombreBodega = nombreBodega;
    }

    public ProductoDto(Integer codigoProducto, String nombreProducto, Integer bodegaId, String nombreBodega, Double precioProducto, Integer unidadesDisponibles, String tipoProducto) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.bodegaId = bodegaId;
        this.nombreBodega = nombreBodega;
        this.precioProducto = precioProducto;
        this.unidadesDisponibles = unidadesDisponibles;
        this.tipoProducto = tipoProducto;
    }
}
