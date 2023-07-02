package com.ram.practice.spring.core1.example2;

import jakarta.annotation.Resource;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PDFMessageProvider implements MessageProvider {

    public String message() {
        return "PDF Message";
    }
}
