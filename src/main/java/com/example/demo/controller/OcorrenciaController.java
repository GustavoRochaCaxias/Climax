package com.example.demo.controller;

import com.example.demo.model.OcorrenciaClimax;
import com.example.demo.producer.OcorrenciaProducer;
import com.example.demo.service.OcorrenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/ocorrencias")
public class OcorrenciaController {

    @Autowired
    private OcorrenciaService service;

    @Autowired
    private OcorrenciaProducer produtor;

    @GetMapping("/novo")
    public String novaOcorrencia(Model model) {
        model.addAttribute("ocorrencia", new OcorrenciaClimax());
        return "relatar_ocorrencia";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute OcorrenciaClimax ocorrencia) {
        service.salvar(ocorrencia);
        produtor.enviarMensagem("Nova ocorrência salva com título: " + ocorrencia.getTitulo());
        return "redirect:/dashboard";
    }

    @GetMapping("/listar")
    public String listar(Model model) {
        var lista = service.listarTodas();
        model.addAttribute("ocorrencias", lista);
        return "listar_ocorrencias";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Long id) {
        service.excluir(id);
        return "redirect:/ocorrencias/listar";
    }

    @GetMapping("/editar/{id}")
    public String editarOcorrencia(@PathVariable Long id, Model model) {
        var ocorrencia = service.buscarPorId(id);
        if (ocorrencia.isPresent()) {
            model.addAttribute("ocorrencia", ocorrencia.get());
            return "relatar_ocorrencia";
        } else {
            return "redirect:/ocorrencias/listar";
        }
    }
}

