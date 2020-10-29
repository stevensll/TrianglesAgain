public class Tester {
    public static void main(String[] args){
        Point testpoint = new Point(3,4);
        Point testpoint2 = new Point(4,5);
        Point testpoint3 = new Point(3,4);
        System.out.println(testpoint.getX()+", "+testpoint.getY());
        System.out.println(testpoint.equals(testpoint2));
        System.out.println(testpoint.equals(testpoint3));
        System.out.println(testpoint.distanceTo(testpoint2)); // Distance should be sqrt 2 or ~ 1.4142...
        System.out.println(testpoint.distanceTo(testpoint3)); // Distance should be 0.0
    }
}
