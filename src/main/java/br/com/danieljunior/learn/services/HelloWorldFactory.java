/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.danieljunior.learn.services;

/**
 *
 * @author danieljr
 */
public class HelloWorldFactory {

    public HelloWorldService createHelloWorldService(String language) {
        HelloWorldService service = null;
        switch (language) {
            case "en":
                service = new HelloWorldServiceEnglishImpl();
                break;
            case "es":
                service = new HelloWorldServiceSpanishImpl();
                break;
            case "fr":
                service = new HelloWorldServiceFrenchImpl();
                break;
            default:
                service = new HelloWorldServiceEnglishImpl();
                break;
        }
        return service;
    }
}
