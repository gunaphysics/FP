package com.basic.classes;

import com.basic.interfaces.SimpleInterfaceWithArgs;

/**
 * Created by GXP8655 on 4/14/2017.
 */
public class UseSimpleInterfaceWithArgs {
    public static void main(String[] args) {
        SimpleInterfaceWithArgs obj = (a,b)-> a+b;
        obj.calculate(3,5);
        SimpleInterfaceWithArgs obj2 = (a,b) -> a-b;
    }
}
