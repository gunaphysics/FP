package com.basic.classes;

import com.basic.interfaces.SimpleInterface;

/**
 * Created by GXP8655 on 4/14/2017.
 */
public class UseSimpleInterface {
    public static void main(String[] args) {
        SimpleInterface obj = ()-> System.out.println("Say Hello!");
        obj.doSomething();
    }
}
