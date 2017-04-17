package com.staticmethods.classes;

import com.staticmethods.interfaces.PersonInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by GXP8655 on 4/17/2017.
 */
public class UseDefaultMethod {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Guna", 29));
        people.add(new Person("Nithya", 27));
        people.add(new Person("Agalya", 1));
        people.add(new Person("Pasupathy", 71));

        Predicate<Person> predicate = p-> p.getAge()>20;
        displayPeople(people, predicate);
    }


    public static void displayPeople(List<Person> people, Predicate<Person> predicate){

        people.forEach(p->{
            if (predicate.test(p)){
                System.out.println(PersonInterface.getPersonInfo(p));
            }

        });
    }
}
