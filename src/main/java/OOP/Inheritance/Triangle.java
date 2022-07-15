package OOP.Inheritance;

import OOP.Inheritance.Figure;

public class Triangle implements Figure {

    private static final int LINES_COUNT = 3;

    private int sideLength;
    private int linesCount;

    public Triangle(int sideLength) {
        this.sideLength = sideLength;
        this.linesCount = LINES_COUNT;
    }

    public int getLinesCount() {
        return linesCount;
    }

    public int getPerimeter() {
        return 3 * sideLength;
    }

    public double getArea() {
        return Math.sqrt(3)/4 * Math.pow(sideLength, 2);
    }

    public void printParameters() {
        System.out.println("sideLength is :" + sideLength + " \nlinesCount is :" + linesCount + "\nperimeter is :" + getPerimeter() + "\narea is :" + getArea());
    }
}
