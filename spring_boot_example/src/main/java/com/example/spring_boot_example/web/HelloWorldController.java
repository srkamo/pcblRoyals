package com.example.spring_boot_example.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class HelloWorldController {

    @CrossOrigin()
    @RequestMapping("/hello")
    public String sayHello(@RequestParam(value = "name") String name){
        return "{\n" +
            "    \"id\": 1,\n" +
                    "    \"content\": \"Hello, World!\"\n" +
                    "}";
    }
}
