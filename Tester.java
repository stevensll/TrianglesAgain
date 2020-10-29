public class Tester {
    public static void main(String[] args){
        //pointTest();
        perimeterTest();
    }
    public static void pointTest() {
        Point testpoint = new Point(3,4);
        Point testpoint2 = new Point(4,5);
        Point testpoint3 = new Point(3,4);
        System.out.println(testpoint.getX()+", "+testpoint.getY());
        System.out.println(testpoint.equals(testpoint2));
        System.out.println(testpoint.equals(testpoint3));
        System.out.println(testpoint.distanceTo(testpoint2)); // Distance should be sqrt 2 or ~ 1.4142...
        System.out.println(testpoint.distanceTo(testpoint3)); // Distance should be 0.0
    }
    public static void perimeterTest() {
        Point a = new Point (0.5248, -0.8002);
        Point b = new Point (-2.437885, 1.94);
        Point c = new Point (0.0, 0.0);
        Triangle pointTriangleTest = new Triangle(a,b,c);
        Triangle coordinateTriangleTest = new Triangle(0.5248, -0.8002, -2.437885, 1.94,0.0, 0.0);
        System.out.println(pointTriangleTest.getPerimeter());
        System.out.println(coordinateTriangleTest.getPerimeter());
    }
}
