package com.soulcode.produtosapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @ResponseBody
    @GetMapping("/elastech")
    public String paginaElasTech(){
        return "Olá eu sou a pagina elas tech";
    }
    @ResponseBody
    @GetMapping("/soulcode")
    public String paginasoulcode(){
        return "Soul code pagina teste";
    }
    @GetMapping("/cadastro-produto")
    public String cadastroProduto(){
        return "cadastro-produto";
    }
    @GetMapping("/cadastro-usuario")
    public String cadastroUsuario(){
        return "cadastro-usuario";
    }
    @GetMapping("/menu")
    public String menu(){
        return "menu";
    }

}
