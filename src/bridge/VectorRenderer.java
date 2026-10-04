package bridge;

public class VectorRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing a circle of radius " + radius + " pixels using Vector graphics.");
    }

    @Override
    public void renderSquare(float side) {
        System.out.println("Drawing a square of side " + side + " pixels using Vector graphics.");
    }
}