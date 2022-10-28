package com.gmail.aleksandrphilimonov.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringStarterApplication {

    public static void main(String[] args) {

        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        CarEngine carEngine = ctx.getBean(CarEngine.class);
        System.out.println(carEngine.getEngineType());

        Car car = ctx.getBean(Car.class);
        car.getEngineModel();

    }

}
