package archetypal_pattern;

public class ARectangle extends AShape {

    public ARectangle() {
        type = "ARectangle";
    }

    @Override
    void draw() {
        System.out.println("shape draw::ARectangle");
    }



}
