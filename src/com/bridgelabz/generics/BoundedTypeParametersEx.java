package com.bridgelabz.generics;

class BoundedBox<T extends Number> {
    private T number;

    public BoundedBox(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }

    public double doubleValue() {
        return number.doubleValue() * 2;
    }
}

public class BoundedTypeParametersEx {
    public static void main(String[] args) {

        BoundedBox<Integer> intBox = new BoundedBox<>(10);
        System.out.println("Integer Value: " + intBox.getNumber());
        System.out.println("Doubled Value: " + intBox.doubleValue());

        BoundedBox<Double> doubleBox = new BoundedBox<>(5.5);
        System.out.println("Double Value: " + doubleBox.getNumber());
        System.out.println("Doubled Value: " + doubleBox.doubleValue());


        // BoundedBox<String> strBox = new BoundedBox<>("Hello");
    }
}
