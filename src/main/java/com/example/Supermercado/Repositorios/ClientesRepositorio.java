package com.example.Supermercado.Repositorios;
import com.example.Supermercado.Entidades.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClientesRepositorio extends JpaRepository<Clientes,Integer> {
}
