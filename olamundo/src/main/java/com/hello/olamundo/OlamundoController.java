package com.hello.olamundo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/olamundo")
public class OlamundoController {

    @GetMapping("/")
    @ResponseBody
    public String olamundo(){
        return "Olá Mundo!";
    }
}