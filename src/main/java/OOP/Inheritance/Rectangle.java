package OOP.Inheritance;

import OOP.Inheritance.Figure;

public class Rectangle implements Figure {
    private static final int LINES_COUNT = 4;

    private int width;
    private int length;
    private int linesCount;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
        this.linesCount = LINES_COUNT;
    }

    public int getLinesCount() {
        return linesCount;
    }

    public int getPerimeter() {
        return 2 * (width + length);
    }

    public double getArea() {
        return width * length;
    }

    public void printParameters() {
        System.out.println("linesCount is :" + linesCount + "\nwidth is: " + width + "\nlength is: " + length +
                "\nperimeter is :" + getPerimeter() + "\narea is :" + getArea());
    }
}
