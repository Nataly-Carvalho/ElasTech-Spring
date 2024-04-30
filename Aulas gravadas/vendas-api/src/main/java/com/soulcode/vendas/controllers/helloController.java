package com.soulcode.vendas.controllers;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


//o controller é responsavel por receber requisições e processa-las
//@Controller
@RestController//O restcontroller ele é o controlador parta apis restfull
public class helloController {
@RequestMapping(value = "/", method = RequestMethod.GET)
//@ResponseBody
    public String helloController() {
        return "Hello world";
    }
}
