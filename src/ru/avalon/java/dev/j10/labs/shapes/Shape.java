package ru.avalon.java.dev.j10.labs.shapes;

public interface Shape extends Point, Comparable<Shape> {

    float getArea();

    // установка default значения метода для классов интерфейса Shape

    default int getRotation() {
        return 0;
    }

    @Override
    default int compareTo(Shape shapes) {
        if (this.getArea() > shapes.getArea()) {
            return 1;
        } else if (this.getArea() == shapes.getArea()) {
            return 0;
        } else {
            return -1;
        }
    }
}