package com.qz.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * Hello world!
 *
 */
@RestController
@SpringBootApplication
public class App
{
    @RequestMapping("/")
    public String index(){
        return "Welcome";
    }

    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
        System.out.println( "Hello World!" );
        Random a123 = new Random();
        for (int i = 0; i < 10000; i++) {
            int value = a123.nextInt(100);
            System.out.printf("value: " + value);
        }
        int []list = new int[]{1,3,4,5};
        for (int i : list) {

        }

    }
}
