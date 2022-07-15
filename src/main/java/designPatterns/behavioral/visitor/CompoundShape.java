package designPatterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class CompoundShape implements Shape {

    public CompoundShape(int id) {
        this.id = id;
    }

    public int id;
    public List<Shape> children = new ArrayList<>();

    @Override
    public void draw() {
        for (Shape shape : children) {
            shape.draw();
        }
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCompoundGraphic(this);
    }

    public void add(Shape shape) {
        children.add(shape);
    }

    public int getId() {
        return id;
    }

    public List<Shape> getChildren() {
        return children;
    }
}
