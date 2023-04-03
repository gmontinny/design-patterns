package v2;

public abstract class Pen {

    protected Shape shape;

    public Pen(Shape shape) {
        this.shape = shape;
    }

    public abstract void draw();
}
