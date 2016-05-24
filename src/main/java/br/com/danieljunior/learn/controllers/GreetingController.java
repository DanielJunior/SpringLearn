/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.danieljunior.learn.controllers;

import br.com.danieljunior.learn.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 *
 * @author danieljr
 */
public class GreetingController {
    private HelloWorldService helloWorldService;
    private HelloWorldService helloWorldServiceFrench;

    @Autowired
    @Qualifier("french")
    public void setHelloWorldServiceFrench(HelloWorldService helloWorldServiceFrench) {
        this.helloWorldServiceFrench = helloWorldServiceFrench;
    }
    
    public String sayHello(){
        String greeting = helloWorldService.getGreeting();
        System.out.println(greeting);
        System.out.println(helloWorldServiceFrench.getGreeting());
        return greeting;
    }

    @Autowired
    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }
    
    
}
