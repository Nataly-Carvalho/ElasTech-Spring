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
}
