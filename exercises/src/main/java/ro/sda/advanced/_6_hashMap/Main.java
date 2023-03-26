package ro.sda.advanced._6_hashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //key value collection for name - age of a person
        Map<String,Integer > myMap = new HashMap<>();//Map = interfata

        myMap.put("Catalin", 25);
        myMap.put("Mihai",40);
        myMap.put("Andrei", 70);
        myMap.put("Leonardo",40);

        System.out.println("Mihai age: " + myMap.get("Mihai"));
        System.out.println("Andrei age: " + myMap.get("Andrei"));

        Map<String ,Person> personMap = new HashMap<>();

        personMap.put("Catalin",new Person("Catalin", "Manaila",25));
        personMap.put("Calin",new Person("Calin", "Marius",20));
        personMap.put("Mihai",new Person("Mihai", "Moldovan",55));
        personMap.put("Catalin",new Person("Catalin", "Manaila",35));//nu putem avea inr-un HashMap key identice

        System.out.println(personMap.get("Catalin"));
        System.out.println(personMap.get("Calin"));

    }
}

class Person{
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}