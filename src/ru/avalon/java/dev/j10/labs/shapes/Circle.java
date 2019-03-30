package ru.avalon.java.dev.j10.labs.shapes;

public class Circle implements Ellipse {

    public static int count; //счетчик кол-ва фигур Circle

    /**
     * Две точки окружности:
     * А(а1,а2) - центр окружности,
     * В(b1,b2) - произвольная точка,
     * соединяющаяся с точкой А и образующие радиус окружности R
     */

    private final float a1, a2;
    private final float b1, b2;

    // присвоение значение из геттеров и наращивание счетчика
    Circle() {

        this.a1 = Point.getX();
        this.a2 = Point.getY();
        this.b1 = Point.getX();
        this.b2 = Point.getY();
        count++;
    }

    // переопределение методы базового класса
    @Override
    public float getRadius() {
        return (float) (Math.sqrt((a1 - b1) * (a1 - b1) + (a2 - b2) * (a2 - b2)));
    }

    @Override
    public float getArea() {
        return (float)(Math.PI * (this.getRadius()*this.getRadius()));
    }

    @Override
    public float getLength() {
        return (float)(2 * Math.PI * this.getRadius());
    }

}
