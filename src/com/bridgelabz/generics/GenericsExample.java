package com.bridgelabz.generics;

class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class GenericsExample {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.setItem(10);
        System.out.println("Integer Box contains: " + intBox.getItem());

        Box<String> strBox = new Box<>();
        strBox.setItem("Hello Generics");
        System.out.println("String Box contains: " + strBox.getItem());
    }
}

