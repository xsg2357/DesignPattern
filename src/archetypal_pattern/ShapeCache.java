package archetypal_pattern;

import javafx.scene.shape.Circle;

import java.util.Hashtable;

public class ShapeCache {

    private static Hashtable<String, AShape> shapeMap
            = new Hashtable<String, AShape>();

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    // 例如，我们要添加三种形状
    public static void loadCache() {
        ACircle circle = new ACircle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        ASquare square = new ASquare();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        ARectangle rectangle = new ARectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }

    public static AShape getShape(String shapeId){
        AShape shape = shapeMap.get(shapeId);

        return (AShape) shape.clone();
    }
}
