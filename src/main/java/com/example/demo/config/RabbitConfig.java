package com.example.demo.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
    public static final String FILA_OCORRENCIAS = "fila.ocorrencias";

    @Bean
    public Queue filaOcorrencias() {
        return new Queue(FILA_OCORRENCIAS, false);
    }
}