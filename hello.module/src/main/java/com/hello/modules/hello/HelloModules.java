package com.hello.modules.hello;

public class HelloModules implements HelloInterface {
    public static void doSomething() {
        System.out.println("Hello, my modules stuff");
    }

    public String sayHello() {
        return("Say Hello via the Interface implementation");
    }
}
