package com.example.Supermercado.Servicios;
import com.example.Supermercado.Entidades.Productos;
import com.example.Supermercado.Repositorios.ProductosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductosServicio {

    //inyeccion de dependencias,permiten que este servicio sea administrado
    // y utilizado en otras partes de la aplicación
    @Autowired
    private ProductosRepositorio productosRepositorio;


    // Este método recibe un objeto nuevoProducto de tipo Productos
    // y utiliza el repositorio productosRepositorio para guardar
    // el nuevo producto en la base de datos. La llamada a productosRepositorio.save(nuevoProducto)
    // devuelve el producto guardado.
    public Productos crearProducto(Productos nuevoProducto)throws Exception{
        try{
            return productosRepositorio.save(nuevoProducto);
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }


    }

    //Este metodo intenta buscar todos los productos en la base de datos utilizando
    //productosRepositorio y si ocurre algún error, lanza una excepción con el mensaje del error
    public List<Productos> buscarTodos() throws Exception {

        try {
            List<Productos> productos = productosRepositorio.findAll();
            return productos;

        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
}
