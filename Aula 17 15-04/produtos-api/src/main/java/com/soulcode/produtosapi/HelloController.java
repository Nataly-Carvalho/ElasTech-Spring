package com.soulcode.produtosapi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
public class HelloController {
    @RequestMapping(value ="/elastech", method = RequestMethod.POST)
    public String paginaElasTech(@RequestParam String nome, @RequestParam int idade, Model model){

    if (idade >= 18){
        model.addAttribute("nome", nome);
        model.addAttribute("idade", idade);
        return "maior-idade";
    }else{
        int anosFaltando = 18 - idade;

        model.addAttribute("nome", nome);
        model.addAttribute("idade", idade);
        model.addAttribute("anosFaltando", anosFaltando);
        return "menor-idade";
    }

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
