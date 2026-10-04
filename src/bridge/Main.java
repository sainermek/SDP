package bridge;

public class Main {
    public static void main(String[] args) {
        Renderer vectorRenderer = new VectorRenderer();
        Renderer rasterRenderer = new RasterRenderer();

        Shape circle = new Circle(vectorRenderer, 5.0f);
        System.out.println("--- Initial State ---");
        circle.draw();

        System.out.println("\n--- Runtime Implementation Switch ---");
        circle.setRenderer(rasterRenderer);
        circle.draw();

        System.out.println("\n--- Resizing and Drawing Square ---");
        Shape square = new Square(vectorRenderer, 4.0f);
        square.draw();
        square.resize(2.0f);
        square.draw();
    }
}