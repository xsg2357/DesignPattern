package bridge_pattern;

public abstract  class DShape {

    protected DrawAPI drawAPI;
    protected DShape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
