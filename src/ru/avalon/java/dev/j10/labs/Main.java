package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.*;
import ru.avalon.java.dev.j10.labs.shapes.ShapeMaker;

public class Main {

    public static void main(String[] args) {

        // Инициализация массива из 10 элементов
        Shape[] shapes = new Shape[9];

        // Создание 10 произвольных фигур
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = ShapeMaker.getNewShape();
        }

        System.out.println("Кругов: " + Circle.count + " шт.");
        System.out.println("Четырехугольников: " + Rectangle.count + " шт.");
        System.out.println("Треугольников: " + Triangle.count + " шт.");

    }



}
