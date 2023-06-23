package com.example.Supermercado.Entidades;

import jakarta.persistence.*;

@Entity
@Table(name= "productos")
public class Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id_producto;

    @Column(nullable = false)
    private String descripcion;

    @Column(nullable = false)
    private Long precio;

    @Column(nullable = false)
    private Integer cantidad;

    public Productos() {
    }

    public Productos(Integer id_producto, String descripcion, Long precio, Integer cantidad) {
        this.id_producto = id_producto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Integer getId_producto() {
        return id_producto;
    }

    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
