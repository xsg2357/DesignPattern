package abstract_factory_pattern;

import factory_pattern.CircleShape;
import factory_pattern.RectangleShape;
import factory_pattern.Shape;
import factory_pattern.SquareShape;

public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if (color == null || color.equals("")) {
            return null;
        }
        switch (color) {
            case "Red":
                return new Red();
            case "Blue":
                return new Blue();
            default:
                return new Green();
        }
    }
}
