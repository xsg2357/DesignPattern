package archetypal_pattern;

public class ACircle  extends  AShape{

    public ACircle() {
        type = "ACircle";
    }

    @Override
    void draw() {
        System.out.println("shape draw::ACircle");
    }
}
