package com.soulcode.vendas.controllers;


import com.soulcode.vendas.models.dtos.ProdutoDTO;
import com.soulcode.vendas.services.ProdutosService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ProdutoController {

    @Autowired
    private ProdutosService produtosService;

    @RequestMapping(value = "/produtos", method = RequestMethod.POST)
    public ProdutoDTO save(@RequestBody  @Valid ProdutoDTO dto){
        return produtosService.save(dto);

    }

    @RequestMapping(value = "/produtos", method = RequestMethod.GET)
    public List<ProdutoDTO> findAll(){
        return produtosService.findAll();

    }

    @RequestMapping(value = "/produtos/{id}", method = RequestMethod.GET)
    public ProdutoDTO findById(@PathVariable Long id){
        return produtosService.findById(id);

    }

    @RequestMapping(value = "/produtos/{id}", method = RequestMethod.DELETE)
    public ProdutoDTO delete(@PathVariable Long id){
       return this.produtosService.deleteById(id);
    }

    @RequestMapping(value = "/produtos/{id}", method = RequestMethod.PUT)
    public ProdutoDTO updateById(@RequestBody  @Valid ProdutoDTO dto, @PathVariable Long id){
        return this.produtosService.updateById(dto, id);
    }

}
