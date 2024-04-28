package com.soulcode.vendas.controllers;

import com.soulcode.vendas.models.Produto;
import com.soulcode.vendas.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @RequestMapping(value = "/produtos", method = RequestMethod.POST)
    public Produto save(@RequestBody Produto produto){
        produto = this.produtoRepository.save(produto);
        return produto;
    }

    @RequestMapping(value = "/produtos", method = RequestMethod.GET)
    public List<Produto> findAll(){
        List<Produto> produtos = this.produtoRepository.findAll();
        return produtos;
    }

    @RequestMapping(value = "/produtos/{id}", method = RequestMethod.GET)
    public Produto findById(@PathVariable Long id){
        Optional<Produto>resultado = this.produtoRepository.findById(id);
        if (resultado.isEmpty()){
            throw new RuntimeException("O produto não foi encontrado");
        }else {
            return resultado.get();
        }

    }

    @RequestMapping(value = "/produtos/{id}", method = RequestMethod.DELETE)
    public Produto delete(@PathVariable Long id){
        Produto produto = findById(id);
        this.produtoRepository.deleteById(id);
        return produto;
    }

    @RequestMapping(value = "/produtos/{id}", method = RequestMethod.PUT)
    public Produto updateById(@PathVariable Long id,@RequestBody Produto produto ){
        this.findById(id);
        produto.setId(id);
        produto = this.produtoRepository.save(produto);
        return produto;
    }

}
