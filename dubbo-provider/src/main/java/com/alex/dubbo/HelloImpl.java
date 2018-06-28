package com.alex.dubbo;

public class HelloImpl implements Hello {
    public String sayHello(String name) {
        return "hello " + name;
    }
}
