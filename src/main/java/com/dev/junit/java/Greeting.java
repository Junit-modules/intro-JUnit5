package com.dev.junit.java;

public class Greeting {

    private static String HELLO = "HELLO";
    private static String WORLD = "WORLD";

    public String printGreeting(){
        return HELLO + ' ' + WORLD;
    }

    public String printGreetingName(String name){
        return HELLO + ' ' + name;
    }
}
