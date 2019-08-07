package com.example.tiendaBelleza.dto;

public class BodegaDto {
    Integer CodigoBodega;
    String NombreBodega;
    String LocalizacionBodega;

    public Integer getCodigoBodega() {
        return CodigoBodega;
    }

    public void setCodigoBodega(Integer codigoBodega) {
        CodigoBodega = codigoBodega;
    }

    public String getNombreBodega() {
        return NombreBodega;
    }

    public void setNombreBodega(String nombreBodega) {
        NombreBodega = nombreBodega;
    }

    public String getLocalizacionBodega() {
        return LocalizacionBodega;
    }

    public void setLocalizacionBodega(String localizacionBodega) {
        LocalizacionBodega = localizacionBodega;
    }

    public BodegaDto(Integer codigoBodega, String nombreBodega, String localizacionBodega) {
        CodigoBodega = codigoBodega;
        NombreBodega = nombreBodega;
        LocalizacionBodega = localizacionBodega;
    }
}
