package com.soulcode.demo.controller;


import com.soulcode.demo.models.Usuario;
import com.soulcode.demo.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @RequestMapping(value = "/cadusuario", method = RequestMethod.POST)
    public Usuario cadastrarUsuario() {

        Usuario usuario = new Usuario();
        usuario.setNome("Nataly");
        usuario = this.usuarioRepository.save(usuario);
        return usuario;
    }
    @RequestMapping(value = "/mostrausuario", method = RequestMethod.GET)
    public List<Usuario> findAll() {
        List<Usuario> usuarios = this.usuarioRepository.findAll();
        return usuarios;
    }
    @RequestMapping(value = "/mostrausuario/{id}", method = RequestMethod.GET)
    public Usuario findById(@PathVariable Long id) {
        Optional<Usuario> usuario = this.usuarioRepository.findById(id);

        if (usuario.isEmpty()) {
            throw new RuntimeException("Usuario não encontrado");
        }else {
            return usuario.get();
        }
    }

    @RequestMapping(value = "/excluir/{id}", method = RequestMethod.DELETE)
    public Usuario deletarById (@PathVariable Long id){
        Usuario usuario = findById(id);
        this.usuarioRepository.delete(usuario);
        return usuario;
    }

    @RequestMapping(value = "/editar/{id}", method = RequestMethod.PUT)
    public Usuario updateById(@PathVariable Long id, @RequestBody Usuario usuario) {
        this.findById(id);
        usuario.setId(id);
        usuario = this.usuarioRepository.save(usuario);
        return usuario;

    }
}
