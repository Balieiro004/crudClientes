package com.balieiro.crudClientes.controller;


import com.balieiro.crudClientes.dto.ClientDTO;
import com.balieiro.crudClientes.entities.Client;
import com.balieiro.crudClientes.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    private ClientService clientService;

    @GetMapping(value = "/{id}")
    public ClientDTO findById(@PathVariable Long id) {
        return clientService.findById(id);
    }

    @GetMapping
    public Page<ClientDTO> findAll(Pageable pageable) {
        return clientService.findAll(pageable);
    }

    @PostMapping
    public ClientDTO insert(@RequestBody ClientDTO clientDTO) {
        return clientService.insert(clientDTO);
    }
}
