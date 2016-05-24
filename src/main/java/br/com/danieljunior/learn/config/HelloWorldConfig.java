/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.danieljunior.learn.config;

import br.com.danieljunior.learn.services.HelloWorldFactory;
import br.com.danieljunior.learn.services.HelloWorldService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

/**
 *
 * @author danieljr
 */
@Configuration
public class HelloWorldConfig {

    @Bean
    @Profile("english")
    @Primary
    public HelloWorldService helloWorldServiceEnglishImpl(HelloWorldFactory factory) {
        return factory.createHelloWorldService("en");
    }
    
    @Bean
    @Profile("spanish")
    public HelloWorldService helloWorldServiceSpanishImpl(HelloWorldFactory factory) {
        return factory.createHelloWorldService("es");
    }
    
    @Bean
    public HelloWorldFactory helloWorldFactory(){
        return new HelloWorldFactory();
    }
}
