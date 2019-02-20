package bridge_pattern;

public class DCircle extends DShape {

    private int x, y, radius;
    protected DCircle(int x, int y, int radius,DrawAPI drawAPI) {
        super(drawAPI);
        drawAPI.drawCircle(radius,x,y);
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
