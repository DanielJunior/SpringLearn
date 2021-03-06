package br.com.danieljunior.learn;

import br.com.danieljunior.learn.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:/context/application-context.xml")
public class LearnApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(LearnApplication.class, args);

//        InjectedByConstructorService injected = (InjectedByConstructorService) ctx.getBean("injectedByConstructorService");
//        injected.getMessage();
//
//        SetterBasedService set = (SetterBasedService) ctx.getBean("setterBasedService");
//        set.getMessage();

        GreetingController controller = (GreetingController) ctx.getBean("greetingController");
        controller.sayHello();
    }
}
