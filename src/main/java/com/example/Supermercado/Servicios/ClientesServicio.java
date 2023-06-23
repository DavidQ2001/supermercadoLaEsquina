package com.example.Supermercado.Servicios;

import com.example.Supermercado.Entidades.Clientes;
import com.example.Supermercado.Repositorios.ClientesRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientesServicio {
        @Autowired
        private ClientesRepositorio clientesRepositorio;



}

