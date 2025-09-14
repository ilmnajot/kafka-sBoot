package uz.ilmnajot.kafkasboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import uz.ilmnajot.kafkasboot.service.ProducerService;

@RestController
@RequestMapping("/api/kafka")
public class MessageController {
    private final ProducerService producerService;

    public MessageController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @GetMapping("/send")
    public String send(@RequestParam String msg) {
        producerService.sendMessage(msg);
        return "Message sent: " + msg;
    }
}
