package abstract_factory_pattern;

import factory_pattern.Shape;

public abstract class AbstractFactory {

    public abstract Shape getShape(String shape);
    public abstract Color getColor(String color);

}
