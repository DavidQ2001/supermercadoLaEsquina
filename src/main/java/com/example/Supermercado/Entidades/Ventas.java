package com.example.Supermercado.Entidades;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name ="ventas")
public class Ventas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private  Integer id_ventas;

    @ManyToOne
    @JoinColumn(name="id_cliente")
    private Clientes clientes;


    @Column(name = "fecha")
    private Date fecha;

    public Ventas() {
    }

    public Ventas(Integer id_ventas, Clientes clientes, Date fecha) {
        this.id_ventas = id_ventas;
        this.clientes = clientes;
        this.fecha = fecha;
    }

    public Integer getId_ventas() {
        return id_ventas;
    }

    public void setId_ventas(Integer id_ventas) {
        this.id_ventas = id_ventas;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @PrePersist
    public void prePersit(){
        this.fecha = new Date();
    }

}
