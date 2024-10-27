package com.pocmaster.demo.service;

import com.pocmaster.demo.model.PMEvent;
import lombok.Data;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import org.jetbrains.annotations.NotNull;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.yaml.snakeyaml.nodes.CollectionNode;

import java.util.function.Consumer;

@Log4j2
@Getter
@Component
public class EventConsumer implements Consumer<PMEvent> {

    @Override
    public void accept(PMEvent pmEvent) {
        log.info("Consumer consume Kafka message -> {}", pmEvent);
    }
}