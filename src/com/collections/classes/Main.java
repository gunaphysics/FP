package com.collections.classes;

import java.util.*;

/**
 * Created by GXP8655 on 4/15/2017.
 */
public class Main {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("aaa");
        strings.add("bbb");
        strings.add("cCc");
        strings.add("DDD");
        strings.add("eeE");
        strings.add("Fff");

/*        Collections.sort(strings);
        System.out.println("Simple Sort");
        for (String s : strings)
            System.out.println(s);

        Comparator<String> comparator = (o1, o2) -> o1.compareToIgnoreCase(o2);
        Collections.sort(strings, comparator);
*//*        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });*//*
        System.out.println("Comparator Sort");
        for (String s : strings)
            System.out.println(s);
            */


     /*   Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());*/

        strings.forEach(str-> System.out.println(str));
    }


}
