package com.gmail.aleksandrphilimonov.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = com.gmail.aleksandrphilimonov.demo.SpringConfig.class)
class SpringStarterApplicationTest {
    @Test
    void contextLoads() {
    }

    @Test
    void valuesForTest() {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        Car car = ctx.getBean("carWithModelValue", Car.class);

        assertEquals("Audi", car.getManufacturer());
    }

}