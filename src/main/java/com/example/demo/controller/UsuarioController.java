package com.example.demo.controller;

import com.example.demo.model.Usuario;
import com.example.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("usuarios", service.listarTodos());
        return "usuario/listar";
    }

    @GetMapping("/novo")
    public String novoForm(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "/form";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        var usuario = service.buscarPorId(id).orElseThrow();
        model.addAttribute("usuario", usuario);
        return "usuario/form";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Long id) {
        service.excluir(id);
        return "redirect:/usuarios";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Usuario usuario, Model model) {
        Usuario usuarioSalvo = service.salvar(usuario);
        model.addAttribute("idUsuario", usuarioSalvo.getId());
        return "usuario_sucesso";  // nome do template sem a extensão .html
    }
}
