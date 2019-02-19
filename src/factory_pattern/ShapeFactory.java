package factory_pattern;

public class ShapeFactory {

    public Shape getShape(String s) {

        if (s == null || s.equals("")) {

            return null;
        }

        switch (s) {
            case "CircleShape":
                return new CircleShape();
            case "SquareShape":
                return new SquareShape();
            default:
                return new RectangleShape();
        }

    }
}
