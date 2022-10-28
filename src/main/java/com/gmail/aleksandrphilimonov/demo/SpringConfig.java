package com.gmail.aleksandrphilimonov.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringConfig {

    @Bean("carBean")
    public Car getCar() {
        return new Car();
    }
}
