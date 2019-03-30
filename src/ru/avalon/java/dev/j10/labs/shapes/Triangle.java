package ru.avalon.java.dev.j10.labs.shapes;

public class Triangle implements Polygon {

    public static int count;

    // координаты точек углов треугольника ABC
    private final float x1, y1;
    private final float x2, y2;
    private final float x3, y3;

    // стороны треугольника ABC
    private final float lineAB;
    private final float lineBC;
    private final float lineCA;


    Triangle() {
        this.x1 = Point.getX();
        this.x2 = Point.getX();
        this.x3 = Point.getX();
        this.y1 = Point.getY();
        this.y2 = Point.getY();
        this.y3 = Point.getY();
        this.lineAB = (float) (Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1)));
        this.lineBC = (float) (Math.sqrt((x3 - x2)*(x3 - x2) + (y3 - y2)*(y3 - y2)));
        this.lineCA = (float) (Math.sqrt((x1 - x3)*(x1 - x3) + (y1 - y3)*(y1 - y3)));
        count++;
    }

    // переопределение методы базового класса
    @Override
    public float getArea() {
        return (float)(Math.sqrt((this.getPerimeter() / 2)
                * ((this.getPerimeter() / 2) - lineAB)
                * ((this.getPerimeter() / 2) - lineBC)
                * ((this.getPerimeter() / 2) - lineCA)));
    }

    @Override
    public float getPerimeter() {
        return lineAB + lineBC + lineCA;
    }

    @Override
    public int getRotation() {
        return 1;
    }

}
