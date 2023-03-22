package com.example.emailservice.kafka;


import com.example.basedomains.dto.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumerEmailService {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderConsumerEmailService.class);

    @KafkaListener(topics = "${spring.kafka.topic.name}",
            groupId = "${spring.kafka.consumer.group-id}"
    )
    public void consume(OrderEvent orderEvent){
        LOGGER.info("Order event received in Email service",orderEvent.toString());

        //Send Email to customer

    }
}
