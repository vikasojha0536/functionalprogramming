package com.example.functional.hashcodeandequalscontracts;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * The basic rule of the contract states that if two objects are equal to each other based on equals() method,
 * then the hash code must be the same, but if the hash code is the same, then equals() can return false
 */

public class Contract {

    public static void main(String[] args) {
        User user1 = new User(LocalDate.of(1990, 1, 10), "User", "Test");
        User user2 = new User(LocalDate.of(1990, 1, 10), "User", "Test");
        System.out.println(user1.equals(user2));
        System.out.println(user1.hashCode() == user2.hashCode());


        Set<User> set = new HashSet<>();
        set.add(user1);
        set.add(user2);
        // if user has no hashcode method overidden then the size will be 2
        // and if overridden it will be 1
        System.out.println(set.size());
    }
}

 class User {

    private LocalDate birthDate;
    private String firstName;
    private String lastName;

     public LocalDate getBirthDate() {
         return birthDate;
     }

     public String getFirstName() {
         return firstName;
     }

     public String getLastName() {
         return lastName;
     }

     public User(LocalDate birthDate, String firstName, String lastName) {
        this.birthDate = birthDate;
        this.firstName = firstName;
        this.lastName = lastName;
    }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;

         User user = (User) o;

         if (!getBirthDate().equals(user.getBirthDate())) return false;
         if (!getFirstName().equals(user.getFirstName())) return false;
         return getLastName().equals(user.getLastName());
     }

     @Override
     public int hashCode() {
         return Objects.hash(birthDate, firstName, lastName);
     }
 }
