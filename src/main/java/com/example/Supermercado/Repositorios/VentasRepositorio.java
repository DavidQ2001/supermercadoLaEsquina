package com.example.Supermercado.Repositorios;

import com.example.Supermercado.Entidades.Ventas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VentasRepositorio extends JpaRepository<Ventas,Integer> {

    Optional<Ventas> findById(Integer id);
}
