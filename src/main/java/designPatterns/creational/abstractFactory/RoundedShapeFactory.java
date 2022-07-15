package designPatterns.creational.abstractFactory;


public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == "Circle") {
            return new RoundedCircle();
        } else if (shapeType == "Rectangle") {
            return new RoundedRectangle();
        }
        return null;
    }
}
