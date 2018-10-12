package com.hello.world;

import com.hello.HelloWorld;
import com.ssssht.PssstHelloWorld;

public class HelloWorldClient {
    public static void main (String arg[]) {
        HelloWorld hello = new HelloWorld();
        System.out.println(hello.sayHelloWorld());

        PssstHelloWorld pssstHelloWorld = new PssstHelloWorld();
        System.out.println( pssstHelloWorld.sayHelloWorld());
    }
}
