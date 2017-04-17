package com.staticmethods.interfaces;

import com.staticmethods.classes.Person;

/**
 * Created by GXP8655 on 4/17/2017.
 */
public interface PersonInterface {

    static String getPersonInfo(Person p){
        return p.getName() +  " (" + p.getAge() + ")";
    }

    String getName();
    void setName(String name);
    int getAge();
    void setAge(int age);
}
