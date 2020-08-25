package ru.max;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan(basePackages = "ru.max")
@Configuration
public class Main {
    public static void main(String[] args) {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("app-context.xml");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Main.class);
        InjectSimpleSpel simpleSpel = ctx.getBean(InjectSimpleSpel.class);
        System.out.println(simpleSpel);

        /*GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("app-context.xml");
        ctx.refresh();
        InjectSimpleSpel simpleSpel = (InjectSimpleSpel) ctx.getBean("injectSimpleSpel");
        System.out.println(simpleSpel);
        ctx.close();*/
    }
}
