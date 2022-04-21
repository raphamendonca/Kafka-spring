package br.com.letscode.KafkaConsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TopicoListener {

    @KafkaListener(topics = "topico", groupId = "Turma810")
    public void listenerTopico(String event){
        System.out.println("Mensagem: " + event);
    }

}
