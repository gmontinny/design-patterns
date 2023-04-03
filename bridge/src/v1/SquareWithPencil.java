package v1;

public class SquareWithPencil extends Pencil {

    @Override
    public void draw() {
        System.out.println(getName() + "Square Pencil");
    }
}
