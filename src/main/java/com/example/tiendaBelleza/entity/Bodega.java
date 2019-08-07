package com.example.tiendaBelleza.entity;

import javax.persistence.*;

@Entity
public class Bodega {
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer CodigoBodega;
    @Column
    private String NombreBodega;
    @Column
    private String LocalizacionBodega;

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


    public Bodega(){

    }
    public Bodega(String nombreBodega, String localizacionBodega) {
        NombreBodega = nombreBodega;
        LocalizacionBodega = localizacionBodega;
    }
}
