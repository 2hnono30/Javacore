package bai4;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Circle circle = new Circle();
        shapeFactory.getShape(circle);
    }
}
