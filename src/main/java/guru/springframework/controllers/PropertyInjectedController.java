package guru.springframework.controllers;

import guru.springframework.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }


}
