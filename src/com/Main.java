package com;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        List<String> arrayList= Collections.unmodifiableList(list);
        for (String s:arrayList) {
            System.out.println(s);
        }
        System.out.println("##################");
         List<String>list2=new ArrayList<>();
        list2.add("one");
        list2.add("two");
        list2.add("three");
        list2= Collections.unmodifiableList(list2);
        for (String s:list2) {
            System.out.println(s);
        }
        System.out.println("##################");
        List<String>list3=new ArrayList<>();
        list3.add("one");
        list3.add("two");
        List<String> list33= Collections.unmodifiableList(list2);
        list3.add("three");
        for (String s:list33) {
            System.out.println(s);
        }

        Set set=  Collections.unmodifiableSet(new HashSet<>());
        Map map=Collections.unmodifiableMap(new HashMap<>());
    }
}
































