/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.danieljunior.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author danieljr
 */
@Component
public class InjectedByConstructorService {
    private HelloWorldService helloWorldService;

    @Autowired
    public InjectedByConstructorService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }
    
    public void getMessage(){
        helloWorldService.sayHello();
    }
}
