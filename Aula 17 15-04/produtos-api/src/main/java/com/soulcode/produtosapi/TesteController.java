package com.soulcode.produtosapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class TesteController {
    @ResponseBody
    @GetMapping("/elastechv2")
    public String paginaElasTech(){
        return "Olá eu sou a pagina teste elas tech";
    }
}
