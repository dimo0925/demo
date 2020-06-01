package com.config.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

public class Listener {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
    @KafkaListener(topics = {"test"})
    public void listen(ConsumerRecord<?, ?> record) {
        logger.info(record.key().toString());
        logger.info(record.value().toString());
    }
}