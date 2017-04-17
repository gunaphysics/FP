package com.collections.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by GXP8655 on 4/15/2017.
 */
public class PredicateInnerClass {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Guna",29));
        people.add(new Person("Nithya",27));
        people.add(new Person("Agalya",1));

        Predicate<Person> predicate = new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return (person.getAge() >=18);
            }
        };
        for(Person person : people)
            if (predicate.test(person))
                System.out.println(person.toString());
    }
}
