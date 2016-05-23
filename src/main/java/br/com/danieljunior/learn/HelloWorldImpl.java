/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.danieljunior.learn;

import org.springframework.stereotype.Component;

/**
 *
 * @author danieljr
 */
@Component
public class HelloWorldImpl implements HelloWorldService{
    
    @Override
    public void sayHello(){
        System.out.println("Hello World!!!");
    }

}
