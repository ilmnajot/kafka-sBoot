package uz.ilmnajot.kafkasboot.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class ConsumerService {

    @KafkaListener(topics = "demo-topic", groupId = "demo-group")
    public void listen(String message) {
        log.info("Received message: {}", message);
    }
}
