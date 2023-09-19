package exam04;

import exam03.Toy;

public class Ex01 {
    public static void main(String[] args) {
        Box<Apple> box = new Box<>();
        box.setItem(new Apple());

        Apple apple = box.getItem();

        // Box<Melon> melonBox = new Box<>();
    }
}
