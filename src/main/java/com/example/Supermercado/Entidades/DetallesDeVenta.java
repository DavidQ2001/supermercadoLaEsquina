package com.example.Supermercado.Entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "detallesDeVenta")
public class DetallesDeVenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private  Integer detallesDeVenta;

    @ManyToOne
    @JoinColumn(name ="id_venta")
    private Ventas ventas;

    @ManyToOne
    @JoinColumn(name ="id_productos")
    private Productos productos;

    @Column(name="cantidad",nullable = false)
    private Integer cantidad;

    @Column(name="precio",nullable = false)
    private Long precio;

    public DetallesDeVenta() {
    }

    public DetallesDeVenta(Integer id_detallesDeVenta, Ventas ventas, Productos productos, Integer cantidad, Long precio) {
        this.detallesDeVenta = id_detallesDeVenta;
        this.ventas = ventas;
        this.productos = productos;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Integer getId_ventasAalDetal() {
        return detallesDeVenta;
    }

    public void setId_ventasAalDetal(Integer id_ventasAalDetal) {
        this.detallesDeVenta = id_ventasAalDetal;
    }

    public Ventas getVentas() {
        return ventas;
    }

    public void setVentas(Ventas ventas) {
        this.ventas = ventas;
    }

    public Productos getProductos() {
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }
}
