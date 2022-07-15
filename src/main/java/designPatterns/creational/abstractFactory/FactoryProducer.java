package designPatterns.creational.abstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryType) {
        if (factoryType == "RoundedShape") {
            return new RoundedShapeFactory();
        } else if (factoryType == "Shape") {
            return new ShapeFactory();
        }
        return null;
    }
}
