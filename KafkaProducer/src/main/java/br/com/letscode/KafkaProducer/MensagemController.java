package br.com.letscode.KafkaProducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MensagemController {

    @Autowired
    private MessageService messageService;

    @PostMapping
    public void publicaMsg(
        @RequestBody MensagemRequest mensagemRequest
    ){
        messageService.send(mensagemRequest.msg);

    }
}
