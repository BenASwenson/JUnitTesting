package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println(getMessage("Ben"));
    }

    public static String getMessage(String name) {
        return "Welcome, " + name + ", to this program.";
    }
}