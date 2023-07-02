package com.ram.practice.spring.core1.example2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageRenderer {


    private final MessageProvider messageProvider;

    public MessageRenderer(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    public void render() {
        System.out.println(messageProvider.message());
    }
}
