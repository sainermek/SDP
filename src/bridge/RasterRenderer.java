package bridge;

public class RasterRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing a circle of radius " + radius + " pixels using Raster pixels.");
    }

    @Override
    public void renderSquare(float side) {
        System.out.println("Drawing a square of side " + side + " pixels using Raster pixels.");
    }
}