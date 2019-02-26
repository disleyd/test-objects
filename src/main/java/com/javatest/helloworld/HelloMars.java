package com.javatest.helloworld;

public class HelloMars extends HelloWorld {

    public void message(String message) {
        super.messageForThisWorld = message;
    }

    public String say() {
        return super.messageForThisWorld;
    }
}
