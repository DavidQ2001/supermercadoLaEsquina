package com.example.Supermercado.Controladores;
import com.example.Supermercado.Entidades.Productos;
import com.example.Supermercado.Servicios.ProductosServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(value = "/api/productosControlador")
public class ProductosControlador {
    @Autowired
    private ProductosServicio productosServicio;

    //Este método está mapeado a la ruta /api/productosControlador utilizando la anotación @PostMapping.
    // Recibe un objeto productos de tipo Productos en el cuerpo de la solicitud (@RequestBody).
    // Luego, llama al método crearProducto del servicio productosServicio para agregar el producto
    // y devuelve el producto creado como respuesta.
    @PostMapping
    public Productos agregarProductos(@RequestBody Productos productos)throws Exception{
        return productosServicio.crearProducto(productos);
    }

    // Llama al método buscarTodos del servicio productosServicio
    // para obtener una lista de todos los productos y devuelve la
    // lista como respuesta.
    @GetMapping
    public List<Productos> buscarTodos() throws Exception{
        return (List<Productos>) productosServicio.buscarTodos();
    }

}
