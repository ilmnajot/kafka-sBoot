package uz.ilmnajot.kafkasboot.controller;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class DemoConsumer {

    @KafkaListener(topics = "demo-topic", groupId = "demo-group")
    public void listen(ConsumerRecord<String, String> record) {
        System.out.println("Consumed message: " + record.value());
    }
}
