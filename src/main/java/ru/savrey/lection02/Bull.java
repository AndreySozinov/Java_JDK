package ru.savrey.lection02;

public interface Bull {
    int amount = 4;
    default void walk() {

        System.out.println("Walks on" + amount + "hooves");
    };
    void talk();
}
