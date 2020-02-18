package ru.alishev.springcourse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloControler {

    @GetMapping("/hello-world") //Когда пользователь наберёт url:/hello-world
    public String sayHello(){
        return "hello_world";
    }
}
