package com.collections.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by GXP8655 on 4/17/2017.
 */
public class InstanceMethodrefernece {

    public static void main(String[] args) {
        InstanceMethodrefernece main = new InstanceMethodrefernece();
        main.sort();
    }

    private void sort() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Guna",29));
        people.add(new Person("Nithya",27));
        people.add(new Person("Agalya",1));
        people.add(new Person("Pasupathy",71));

        Collections.sort(people, this::compareNames);
        people.forEach(p-> System.out.println(p));
    }

    public int compareNames(Person p1, Person p2){
        String name1 = p1.getName();
        return name1.compareTo(p2.getName());
    }
}
