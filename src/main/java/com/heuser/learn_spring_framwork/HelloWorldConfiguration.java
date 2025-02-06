package com.heuser.learn_spring_framwork;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// These records will print the to string method when called
record Person (String name, int age, Address address) { };
// Address record
record Address (String streetName, String city) {

    @Override
    public String toString() {
        return streetName + " " + city ;
    }
};

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
        return new Person("Hannah", 20,
                new Address("Fist Street", "Grandview"));
    }

    // This is one way to create a spring bean with existing spring beans.
    // we call the methods in the class and pass the information to the "Person" record to create a new person.
    @Bean
    public Person person2MethodCall(){
        return new Person(name(), age(), address()); //name, age
    }

    // This is another way to create a new spring bean using existing spring beans.
    // This way autowires through parameters
    @Bean
    public Person person3Parameters(String name, int age, Address address3){
        return new Person(name, age, address3);
    }

    @Bean
    @Primary
    public Person person4Parameters(String name, int age, Address address){
        return new Person(name, age, address);
    }

    @Bean
    public Person person5Qualifier(String name, int age, @Qualifier("address3Qualifier") Address adress){
        return new Person(name, age, adress);
    }

    @Bean(name = "address2")
    @Primary
    public Address address() {
        return new Address("Sandusky St.", "Delaware");
    }


    @Bean(name = "address3")
    @Qualifier("address3Qualifier")
    public Address address3() {
        return new Address("William St.", "Delaware");
    }



}
