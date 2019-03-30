package ru.avalon.java.dev.j10.labs.shapes;

public class ShapeMaker {


    public static Shape getNewShape() {

        int randomNum123 = (int) (Math.random() * 3);

        // Return фигуры в массив в зависимости от результата

        switch (randomNum123) {
            case 0:
                return new Circle();
            case 1:
                return new Triangle();
            case 2:
                return new Rectangle();
            default:
                return new Circle();
        }
    }
}
