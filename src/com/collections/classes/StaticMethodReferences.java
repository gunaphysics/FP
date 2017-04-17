package com.collections.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by GXP8655 on 4/15/2017.
 */
public class StaticMethodReferences {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Guna",29));
        people.add(new Person("Nithya",27));
        people.add(new Person("Agalya",1));
        people.add(new Person("Pasupathy",71));

        Collections.sort(people, Person::compareAges);
        people.forEach(p-> System.out.println(p));

    }
}
