package v2;

public class Pencil extends Pen {

    public Pencil(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        System.out.println("Pencil " + super.shape.draw());
    }
}
