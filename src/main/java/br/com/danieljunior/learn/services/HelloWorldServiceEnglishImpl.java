/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.danieljunior.learn.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 *
 * @author danieljr
 */
@Component
//this enable a way to choose a diferent language to be displayed. This configurations keep at application.properties file
@Profile("english")
public class HelloWorldServiceEnglishImpl implements HelloWorldService{

    @Override
    public String getGreeting() {
        return "Hello World!!!"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
