package com.soulcode.produtosapi.Controller;

import com.soulcode.produtosapi.Model.Usuario;
import com.soulcode.produtosapi.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @RequestMapping(value = "/usuario", method = RequestMethod.GET)
    public Usuario save(){
        Usuario usuario = new Usuario();

        usuario.setNome("nataly");
        usuario.setEmail("nataly@gmail.com");
        usuario.setIdade(10);
        return usuarioRepository.save(usuario);

    }
}
