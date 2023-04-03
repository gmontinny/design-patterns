package v2;

public class BallPen extends Pen {

    public BallPen(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        System.out.println("Ball Pen" + super.shape.draw());
    }
}
