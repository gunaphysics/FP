package com.collections.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by GXP8655 on 4/15/2017.
 */
public class PredicateLambda {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Guna",29));
        people.add(new Person("Nithya",27));
        people.add(new Person("Agalya",1));
        people.add(new Person("Pasupathy",71));

        Predicate<Person> predicate = (person -> person.getAge()>18);
        Predicate<Person> predicateOld = (person -> person.getAge()>40);
        display(people, predicate );
        display(people, predicateOld );

  /*      people.forEach(p->{
            if (p.getAge() > 18)
                System.out.println(p);
        });*/

       }

    public static void display(List<Person> people, Predicate<Person> predicate) {
        people.forEach(p-> {
            if (predicate.test(p))
                System.out.println(p);
        });
    }
}
