package com.example.demo.producer;

import com.example.demo.config.RabbitConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class OcorrenciaConsumer {

    @RabbitListener(queues = RabbitConfig.FILA_OCORRENCIAS)
    public void receberMensagem(String mensagem) {
        System.out.println("Mensagem recebida: " + mensagem);
    }
}