package com.example.demo.controller;

import com.example.demo.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/chat")
public class ChatController {

    @Autowired
    private ChatService chatService;

    @GetMapping
    public String exibirChat() {
        return "/chat"; // garante que você tenha um chat.html dentro de templates/chat/
    }

    @PostMapping
    public String enviarMensagem(@RequestParam("mensagem") String mensagem, Model model) {
        String resposta = chatService.enviarMensagem(mensagem);
        model.addAttribute("mensagem", mensagem);
        model.addAttribute("resposta", resposta);
        return "/chat";
    }
}
