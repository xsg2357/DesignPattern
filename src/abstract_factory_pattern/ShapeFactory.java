package abstract_factory_pattern;

import factory_pattern.CircleShape;
import factory_pattern.RectangleShape;
import factory_pattern.Shape;
import factory_pattern.SquareShape;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        if (shape == null || shape.equals("")) {
            return null;
        }
        switch (shape) {
            case "CircleShape":
                return new CircleShape();
            case "SquareShape":
                return new SquareShape();
            default:
                return new RectangleShape();
        }
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
