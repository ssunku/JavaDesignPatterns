package org.example;

public class Person {

     private String firstName;
     private String lastName;
     private String middleName;

     public Person(String firstName,String lastName,String middleName){
           this.firstName=firstName;
           this.lastName=lastName;
           this.middleName=middleName;
     }
     @Override
     public String toString(){

          return firstName+"-"+lastName+"-"+middleName;
     }

     public static class PersonBuilder{
          private String firstName;
          private String lastName;
          private String middleName;

          public PersonBuilder firstName(String firstName){
               this.firstName=firstName;
               return this;
          }
          public PersonBuilder lastName(String lastName){
               this.lastName=lastName;
               return this;
          }
          public PersonBuilder middleName(String middleName){
               this.middleName=middleName;
               return this;
          }

          public Person  build(){
               return new Person(firstName,lastName,middleName);
          }
     }
}
