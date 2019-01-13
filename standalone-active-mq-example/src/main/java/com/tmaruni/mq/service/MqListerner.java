package com.tmaruni.mq.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class MqListerner {

    @JmsListener(destination = "standalone.queue")
    public void consume(final String message){
        System.out.println("Received message: " + message);
    }

}
