package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Создание класса интерфейса точки,
 * являющейся универсальным методом
 * классов Circle, Rectangle, Triangle
 */

public interface Point {

    // методы, передающие значения координат Х и У

    static float getX() { return (float) (Math.random() * 100); }
    static float getY() { return (float) (Math.random() * 100); }
}
