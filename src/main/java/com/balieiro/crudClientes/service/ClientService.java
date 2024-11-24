package com.balieiro.crudClientes.service;

import com.balieiro.crudClientes.dto.ClientDTO;
import com.balieiro.crudClientes.entities.Client;
import com.balieiro.crudClientes.repositories.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@AllArgsConstructor
@Service
public class ClientService {

    private ClientRepository clientRepository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Client client = clientRepository.findById(id).get();
        return new ClientDTO(client);
    }
}
