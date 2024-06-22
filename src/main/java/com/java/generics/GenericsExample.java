package com.java.generics;

import java.io.Serializable;

public class GenericsExample<T extends Number & Serializable> {

    T number;

    GenericsExample(T number) {
        this.number = number;
    }

    public void print() {
        System.out.println("The value for generic T is: " + number);
    }

    public static <T> void methodGenerics(T t) {
        System.out.println("Method as generic with no return value: " + t);
    }

    public static <T, U> void methodGenerics(T t, U u) {
        System.out.println("Method as generic with multiple parameters: " + t + " : " + u);
    }

    public static <T, U> T methodGenericsWithReturnType(T t, U u) {
        return t;
    }

    public static void main(String[] args) {
        GenericsExample<Integer> integerGenericsExample = new GenericsExample<>(3123);
        integerGenericsExample.print();

        GenericsExample<Double> doubleGenericsExample = new GenericsExample<>(3123.20);
        doubleGenericsExample.print();

        methodGenerics(12345);
        methodGenerics(12345.000);
        methodGenerics("It can take any type of data as parameter.");

        methodGenerics(123, "String Value");
        methodGenerics(123.32, "Double Value");
        methodGenerics(123, "String value");

        Integer testValues = methodGenericsWithReturnType(123, "Test Values");
        System.out.println("Return from Generics method: " + testValues);
    }
}
