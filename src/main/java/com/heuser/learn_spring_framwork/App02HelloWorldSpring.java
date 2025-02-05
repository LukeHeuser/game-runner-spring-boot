package com.heuser.learn_spring_framwork;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring extends HelloWorldConfiguration{

    public static void main(String[] args) {

        // 1: Launch a Spring Context

        var context =
                new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // 2: Configure what we want Spring to manage - @Configuration
        // HelloWorldConfigurationClass - @Configuration
        // name- @Bean

        // You can also retrieve a Bean by using the type of the Bean
        //System.out.println(context.getBean(Address.class));

        // 3: Retrieving Beans managed by Spring
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address2"));


        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3Parameters"));

        // This will print ALL beans that are managed by the IOC
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);


        // The following is playing with the beans of the GIVEN context: "HelloWorldConfiguration"
        // We have
        Person chris = new Person("Chris", 15,
                new Address ("Bernard St.","Seattle"));

        System.out.println(chris.name() + " is " + chris.age() + " years old and lives at " +
                chris.address());

        System.out.println(context.getBean(Person.class));
        System.out.println(context.getBean(Address.class));

        System.out.println(context.getBean("person5Qualifier"));
    }

}
