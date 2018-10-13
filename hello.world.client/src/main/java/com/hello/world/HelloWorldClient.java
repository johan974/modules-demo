package com.hello.world;

import com.hello.HelloWorld;
import com.hello.modules.hello.HelloInterface;
import com.hello.modules.hello.HelloModules;
import com.httpstuff.ApacheTest;
import com.ssssht.PssstHelloWorld;

public class HelloWorldClient {
    public static void main (String arg[]) {
        HelloWorld hello = new HelloWorld();
        System.out.println( "1: " + hello.sayHelloWorld());

        PssstHelloWorld pssstHelloWorld = new PssstHelloWorld();
        System.out.println( "2: " + pssstHelloWorld.sayHelloWorld());

        ApacheTest apacheTest = new ApacheTest();
        System.out.println( "3: " + apacheTest.accessHttp());

        HelloModules.doSomething();

        HelloInterface helloInterface = new HelloModules();
        System.out.println( "4: " + helloInterface.sayHello());
    }
}
