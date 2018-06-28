package com.alex.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerRun {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        Hello hello = (Hello) context.getBean("hello", Hello.class);

        String alex = hello.sayHello("alex");

        System.out.println(alex);

    }
}
