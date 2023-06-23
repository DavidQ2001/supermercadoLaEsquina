package com.example.Supermercado.Repositorios;

import com.example.Supermercado.Entidades.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductosRepositorio extends JpaRepository<Productos,Integer> {
}
