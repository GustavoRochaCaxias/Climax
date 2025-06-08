package com.example.demo.producer;

import com.example.demo.config.RabbitConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OcorrenciaProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void enviarMensagem(String mensagem) {
        rabbitTemplate.convertAndSend(RabbitConfig.FILA_OCORRENCIAS, mensagem);
        System.out.println("Mensagem enviada: " + mensagem);
    }
}