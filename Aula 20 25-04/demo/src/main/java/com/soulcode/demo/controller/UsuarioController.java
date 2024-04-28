package com.soulcode.demo.controller;


import com.soulcode.demo.models.Usuario;
import com.soulcode.demo.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    @RequestMapping(value = "/mostrarusuario", method = RequestMethod.GET)
    public List<Usuario> findAll() {
        List<Usuario> usuarios = this.usuarioRepository.findAll();
        return usuarios;
    }
    @RequestMapping(value = "/mostrarusuario/{id}", method = RequestMethod.GET)
    public Usuario findById(@PathVariable Long id) {
        Optional<Usuario> usuario = this.usuarioRepository.findById(id);

        if (usuario.isEmpty()) {
            throw new RuntimeException("Usuario não encontrado");
        }else {
            return usuario.get();
        }
    }
}
