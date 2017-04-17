package com.defaultmethods.interfaces;

/**
 * Created by GXP8655 on 4/17/2017.
 */
public interface PersonInterface {

    default String getPersonInfo(){
        return getName() +  " (" + getAge() + ")";
    }

    String getName();
    void setName(String name);
    int getAge();
    void setAge(int age);
}
