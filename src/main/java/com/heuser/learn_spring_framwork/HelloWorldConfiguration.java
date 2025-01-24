package com.heuser.learn_spring_framwork;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// These records will print the to string method when called
record Person (String name, int age) { };
record Address (String streetName, String city) { };

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Luke";
    }

    @Bean
    public int age() {
        return 25;
    }

    @Bean
    public Person person() {
        return new Person("Hannah", 20);
    }

    @Bean
    public Address address() {
        return new Address("Sandusky St.", "Delaware");
    }


}
