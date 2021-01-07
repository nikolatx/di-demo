package guru.springframework.controllers;

import guru.springframework.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;


    @BeforeEach
    void setUp() {
        constructorInjectedController=new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void name() {
        assertEquals(constructorInjectedController.sayHello(), GreetingServiceImpl.HELLO_GURUS);
    }

}
