package v1;

public class Teste {
    public static void main(String[] args) {
        Pen circleWithBallPen = new CircleWithBallPen();
        circleWithBallPen.draw();

        Pen circleWithPencil = new CircleWithPencil();
        circleWithPencil.draw();

        Pen squareWithBallPen = new SquareWithBallPen();
        squareWithBallPen.draw();

        Pen squareWithPencil = new SquareWithPencil();
        squareWithPencil.draw();
    }
}
