package designPatterns.creational.factory;

public class ShapeFactory {
    public Shape getShape(String shapeName) {
        if (shapeName == "Circle") {
            return new Circle();
        } else if (shapeName == "Rectangle") {
            return new Rectangle();
        } else if (shapeName == "Triangle") {
            return new Triangle();
        }
        return null;
    }
}
