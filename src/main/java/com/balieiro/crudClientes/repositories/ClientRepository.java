package com.balieiro.crudClientes.repositories;

import com.balieiro.crudClientes.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
