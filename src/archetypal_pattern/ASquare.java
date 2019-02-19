package archetypal_pattern;

public class ASquare extends AShape {

    public ASquare() {
        type = "ASquare";
    }

    @Override
    void draw() {
        System.out.println("shape draw::ASquare");
    }
}
