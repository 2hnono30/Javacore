package PointAndMovingPoint;

public class Main {
    public static void main(String[] args) {
        Point unknownPoint = new Point(20,30);
        System.out.println(unknownPoint.toString());
        unknownPoint.setXY(10,20);
        System.out.println(unknownPoint.toString());
        unknownPoint = new pointAndMovingPoint (unknownPoint.getX(),
                unknownPoint.getY(),
                10,
                20);
        System.out.println(unknownPoint.toString());
        ((pointAndMovingPoint) unknownPoint).move();
        System.out.println(unknownPoint.toString());
        pointAndMovingPoint anotherPoint = new pointAndMovingPoint(20,20);
        System.out.println(anotherPoint.toString());
        anotherPoint.move();
        System.out.println(anotherPoint.toString());
    }
}
