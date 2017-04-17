package com.staticmethods.classes;

import com.staticmethods.interfaces.PersonInterface;

/**
 * Created by GXP8655 on 4/17/2017.
 */
public class Person implements PersonInterface {

    public Person( String name, int age) {
        this.age = age;
        this.name = name;
    }

    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
}
