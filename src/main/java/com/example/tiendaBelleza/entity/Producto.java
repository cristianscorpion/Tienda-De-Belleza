package com.example.tiendaBelleza.entity;
import javax.persistence.*;

@Entity
public class Producto {

    private static final long serialVersionUID = 0x62A6DA99AABDA8A8L;

    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer CodigoProducto;
    @Column
    private String NombreProducto;

    @ManyToOne()
    private Bodega bodega;

    public Integer getCodigoProducto() {
        return CodigoProducto;
    }

    public void setCodigoProducto(Integer codigoProducto) {
        CodigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        NombreProducto = nombreProducto;
    }

    public Bodega getBodega() {
        return bodega;
    }

    public void setBodega(Bodega bodega) {
        this.bodega = bodega;
    }

    public Producto(){

    }

    public Producto(String nombreProducto) {
        NombreProducto = nombreProducto;
    }
}
