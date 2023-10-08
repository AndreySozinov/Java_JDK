package ru.savrey.lection02;

public class Man implements Human {

    @Override
    public void walk() {
        System.out.println("Walks on 2 feet");
    }

    @Override
    public void talk() {
        System.out.println("Talks meaningful words");
    }
}
