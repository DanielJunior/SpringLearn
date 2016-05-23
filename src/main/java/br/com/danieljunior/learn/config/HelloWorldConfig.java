/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.danieljunior.learn.config;

import br.com.danieljunior.learn.services.HelloWorldService;
import br.com.danieljunior.learn.services.HelloWorldServiceEnglishImpl;
import br.com.danieljunior.learn.services.HelloWorldServiceSpanishImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 *
 * @author danieljr
 */
@Configuration
public class HelloWorldConfig {

    @Bean
    @Profile({"default", "english"})
    public HelloWorldService helloWorldServiceEnglishImpl() {
        return new HelloWorldServiceEnglishImpl();
    }
    
    @Bean
    @Profile("spanish")
    public HelloWorldService helloWorldServiceSpanishImpl() {
        return new HelloWorldServiceSpanishImpl();
    }
}
