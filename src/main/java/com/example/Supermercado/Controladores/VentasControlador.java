package com.example.Supermercado.Controladores;

import com.example.Supermercado.Entidades.Ventas;

import com.example.Supermercado.Servicios.VentasServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/ventasControlador")
public class VentasControlador {

    @Autowired
    VentasServicio ventasServicio;

    @PostMapping
    public Ventas agregarVentas(@RequestBody Ventas ventas)throws Exception{
        return ventasServicio.crearVenta(ventas);
    }

    @GetMapping
    public List<Ventas> buscarTodos() throws Exception{
        return (List<Ventas>) ventasServicio.buscarTodos();
    }

    @GetMapping("/{id}")
    public Ventas buscarPorId(@PathVariable Integer id){
        return  ventasServicio.buscarPorId(id);
    }

}
