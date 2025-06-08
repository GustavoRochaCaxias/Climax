package com.example.demo.controller;

import com.example.demo.service.EnderecoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EnderecoController {

    private final EnderecoService enderecoService;

    public EnderecoController(EnderecoService enderecoService) {
        this.enderecoService = enderecoService;
    }

    @GetMapping("/enderecos")
    public String listarEnderecos(Model model) {
        model.addAttribute("enderecos", enderecoService.listarTodos());
        return "/listar_enderecos";
    }
}
