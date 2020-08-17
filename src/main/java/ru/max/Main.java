package ru.max;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("app-context.xml");
//        ApplicationContext ctx = new ClassPathXmlApplicationContext();
        InjectSimpleSpel simpleSpel = ctx.getBean("injectSimpleSpel", InjectSimpleSpel.class);
        System.out.println(simpleSpel);
        /*GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("app-context.xml");
        ctx.refresh();
        InjectSimpleSpel simpleSpel = (InjectSimpleSpel) ctx.getBean("injectSimpleSpel");
        System.out.println(simpleSpel);
        ctx.close();*/
    }
}
