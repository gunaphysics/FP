package com.collections.classes;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by GXP8655 on 4/15/2017.
 */
public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(){}
    String name;
    int age;

    @Override
    public String toString() {
        return "name : " + name +", age : " + age;
    }

    public static int compareAges(Person p1, Person p2){
        Integer age1 = p1.getAge();
        return age1.compareTo(p2.getAge());
    }


}
