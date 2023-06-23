package com.example.Supermercado.Repositorios;

import com.example.Supermercado.Entidades.DetallesDeVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetallesDeVentaRepositorio extends JpaRepository<DetallesDeVenta,Integer> {
}
