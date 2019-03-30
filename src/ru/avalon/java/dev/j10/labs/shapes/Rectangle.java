package ru.avalon.java.dev.j10.labs.shapes;

public class Rectangle implements Polygon {

    public static int count;

    // координаты точек углов прям-ка ABCD
    private final float x1, y1;
    private final float x2, y2;
    private final float x3, y3;
    private final float x4, y4;

    // стороны прям-ка
    private final float lineAB;
    private final float lineBC;
    private final float lineCD;
    private final float lineDA;

    Rectangle() {
        this.x1 = Point.getX();
        this.x2 = Point.getX();
        this.x3 = Point.getX();
        this.x4 = Point.getX();
        this.y1 = Point.getY();
        this.y2 = Point.getY();
        this.y3 = Point.getY();
        this.y4 = Point.getY();
        this.lineAB = (float) (Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)));
        this.lineBC = (float) (Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2)));
        this.lineCD = (float) (Math.sqrt((x4-x3)*(x4-x3)+(y4-y3)*(y4-y3)));
        this.lineDA = (float) (Math.sqrt((x1-x4)*(x1-x4)+(y1-y4)*(y1-y4)));
        count++;
    }

    // переопределение методы базового класса
    @Override
    public float getPerimeter() {
        return (lineAB + lineBC + lineCD + lineDA);

    }

    @Override
    public float getArea() {
        float perimeter = (float) ((lineAB+lineBC+lineCD+lineDA)*0.5);
        return (float) Math.sqrt((perimeter-lineAB)*(perimeter-lineBC)*(perimeter-lineCD)*(perimeter-lineDA));
    }

    @Override
    public int getRotation() {
        return 1;
    }
}
