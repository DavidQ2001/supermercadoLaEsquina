package com.example.Supermercado.Servicios;
import com.example.Supermercado.Entidades.Productos;
import com.example.Supermercado.Entidades.Ventas;
import com.example.Supermercado.Repositorios.ProductosRepositorio;
import com.example.Supermercado.Repositorios.VentasRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class VentasServicio {
    @Autowired
    private VentasRepositorio ventasRepositorio;

    public Ventas crearVenta(Ventas nuevaVenta) throws Exception {

        try {
            return ventasRepositorio.save(nuevaVenta);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }

    }
    public List<Ventas> buscarTodos() throws Exception {

        try {
            List<Ventas> ventas = ventasRepositorio.findAll();
            return ventas;

        } catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    public Ventas buscarPorId(Integer id) {

        return ventasRepositorio.findById(id).get();

        }


    }




