package org.example;

public class Main {
    public static void main(String[] args) {
        Simple<String> strings = new SimpleArray<>();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        strings.delete(1);
        System.out.println(strings.get(1));
        System.out.println("``````````````````````````````");
        for (String a : strings) {
            System.out.println(a);
        }
    }
}
