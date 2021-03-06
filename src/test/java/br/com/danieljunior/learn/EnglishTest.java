/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.danieljunior.learn;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author danieljr
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:context/helloworld-config.xml", "classpath:context/english-helloworld.xml"})
public class EnglishTest {

    @Autowired
    br.com.danieljunior.learn.services.HelloWorldService helloWorldService;

    @Test
    public void testHelloWorld() {
        String greeting = helloWorldService.getGreeting();
        Assert.assertEquals("Hello World!!!", greeting);
    }
}
