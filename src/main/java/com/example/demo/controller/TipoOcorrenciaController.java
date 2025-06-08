package com.example.demo.controller;

import org.springframework.ui.Model;
import com.example.demo.model.TipoOcorrenciaClimax;
import com.example.demo.service.TipoOcorrenciaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/tipoOcorrencia")
public class TipoOcorrenciaController {

    private final TipoOcorrenciaService service;

    public TipoOcorrenciaController(TipoOcorrenciaService service) {
        this.service = service;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("tipos", service.listarTodos());
        return "tipo_ocorrencia";  // Nome do template Thymeleaf
    }

    @GetMapping("/novo")
    public String novoFormulario(Model model) {
        model.addAttribute("tipoOcorrencia", new TipoOcorrenciaClimax());
        return "tipo_ocorrencia_form";  // Página para criar/editar
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute("tipoOcorrencia") TipoOcorrenciaClimax tipo) {
        service.salvar(tipo);
        return "redirect:/tipoOcorrencia";
    }

    @GetMapping("/editar/{id}")
    public String editarFormulario(@PathVariable Long id, Model model) {
        Optional<TipoOcorrenciaClimax> tipo = service.buscarPorId(id);
        if (tipo.isPresent()) {
            model.addAttribute("tipoOcorrencia", tipo.get());
            return "tipo_ocorrencia_form";
        } else {
            return "redirect:/tipoOcorrencia";
        }
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Long id) {
        service.deletarPorId(id);
        return "redirect:/tipoOcorrencia";
    }
}