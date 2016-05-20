package br.com.danieljunior.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearnApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(LearnApplication.class, args);

        InjectedByConstructorService injected = (InjectedByConstructorService) ctx.getBean("injectedByConstructorService");
        injected.getMessage();

        SetterBasedService set = (SetterBasedService) ctx.getBean("setterBasedService");
        set.getMessage();
    }
}
