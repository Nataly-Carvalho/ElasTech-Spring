package com.soulcode.vendas.controllers;

import com.soulcode.vendas.models.dtos.ClienteDTO;
import com.soulcode.vendas.services.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @PostMapping("/cliente")
    public ClienteDTO save(@RequestBody @Valid ClienteDTO clienteDTO) {
        return this.clienteService.save(clienteDTO);
    }
    @GetMapping("/cliente")
    public List<ClienteDTO> findAll() {
        return this.clienteService.findAll();
    }

    @GetMapping( "/cliente/{id}")
    public ClienteDTO findById(@PathVariable Long id) {
        return this.clienteService.findById(id);
    }

    @DeleteMapping("/cliente/{id}")
    public ClienteDTO deleteById(@PathVariable Long id) {
        return this.clienteService.deleteById(id);
    }

    @PutMapping( "/cliente/{id}")
    public ClienteDTO updateById(@PathVariable @Valid Long id, @RequestBody ClienteDTO clienteDTO) {
        return this.clienteService.updateById(id, clienteDTO);
    }


}
