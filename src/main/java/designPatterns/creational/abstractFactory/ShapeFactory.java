package designPatterns.creational.abstractFactory;



public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == "Circle") {
            return new Circle();
        } else if (shapeType == "Rectangle") {
            return new Rectangle();
        }
        return null;
    }
}
