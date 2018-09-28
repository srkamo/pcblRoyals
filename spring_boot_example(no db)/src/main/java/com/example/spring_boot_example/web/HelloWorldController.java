package com.example.spring_boot_example.web;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @CrossOrigin()
    @RequestMapping("/hello")
    public Greeting sayHello(@RequestParam(value = "name") String name){
        System.out.println("say Hello");

        //return "Hello " + name + "!";
//        return "{\n" +
//                "    \"id\": 1,\n" +
//                "    \"content\": \"Hello, World!\"\n" +
//                "}";

        return new Greeting(1, "Hello " + name);
    }
}
