package com.example.functional.codingquestions.map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Account {
    private String firstName;
    private String lastName;
    private String accountNumber;

    public String getFirstName() {
        return firstName;
    }

    public Account setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Account setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Account setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(firstName, account.firstName) && Objects.equals(lastName, account.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
public class CollectMap {



    public static void main(String[] args) {

        Account a1 = new Account().setAccountNumber("1").setFirstName("f1").setLastName("l1");
        Account a2 = new Account().setAccountNumber("2").setFirstName("f1").setLastName("l1");
        Account a3 = new Account().setAccountNumber("3").setFirstName("f2").setLastName("l1");

        // without overriding hashcode and equals
        /*
        "C:\Program Files\Java\jdk-17.0.3.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.2\lib\idea_rt.jar=60135:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\vojha\OneDrive - Sopra Steria\psd2\workspace\functionalprogramming\out\production\main" com.example.functional.codingquestions.map.CollectMap
         Exception in thread "main" java.lang.IllegalStateException: Duplicate key f1 (attempted merging values 1 and 2)
         */
        // after overriding hashcode and equals it will pass
        Map<String, Long> collect1 = Stream.of(a1, a2, a3).collect(Collectors.groupingBy(Account::getFirstName, Collectors.counting()));
        System.out.println(collect1);
        String s = "s a b b v g g y";
        //List<String> collect = Arrays.stream(s.split(" ")).distinct().collect(Collectors.toList());
        List<String> collect = Arrays.stream(s.split(" ")).collect(
                                             Collectors.groupingBy(t -> t, Collectors.counting()))
                                     .entrySet().stream().filter(t -> t.getValue() == 1)
                                     .map(Map.Entry::getKey).toList();
        System.out.println(collect);
    }

}
