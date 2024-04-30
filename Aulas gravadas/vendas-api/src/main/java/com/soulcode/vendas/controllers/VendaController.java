package com.soulcode.vendas.controllers;

import com.soulcode.vendas.models.dtos.VendaDTO;
import com.soulcode.vendas.services.VendaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VendaController {

    @Autowired
    VendaService vendaService;

    @PostMapping("/vendas")
    public VendaDTO save(@RequestBody  @Valid VendaDTO vendaDTO) {
        return this.vendaService.save(vendaDTO);
    }

    @GetMapping("/vendas")
    public List<VendaDTO> findAll() {
        return this.vendaService.findAll();
    }

    @GetMapping("/vendas/{id}")
    public VendaDTO findById(@PathVariable Long id) {
        return this.vendaService.findByid(id);
    }

}
