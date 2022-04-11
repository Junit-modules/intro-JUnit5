package com.dev.junit.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    @Test
    void printGreeting() {
        Greeting greeting = new Greeting();
        System.out.println(greeting.printGreeting());
    }

    @Test
    void printGreetingName() {
        Greeting greeting = new Greeting();
        System.out.println(greeting.printGreeting("Java JUnit"));
    }
}