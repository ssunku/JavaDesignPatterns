package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Person person= new  Person.PersonBuilder().firstName("satya").build();
       // System.out.println(person);
          Map<String, Supplier<Person>> persons=new HashMap<>();
          persons.put("car",()->new Person("sds","sdsd",""));
          Map<String,String> personDetails=new HashMap<>();
        personDetails.put("firstName","Satya");
        personDetails.put("lastName","Sunku");
        personDetails.put("middleName","Soundarya");
        personDetails.forEach((key,value)->{
            System.out.println(key);
        });
        personDetails.keySet().stream().forEach(System.out::println);
        }

}