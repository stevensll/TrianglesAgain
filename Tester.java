public class Tester {
    
    public static void main(String[] args){
        Point testpoint = new Point(3,4);
        Point testpoint2 = new Point(4,5);
        Point testpoint3 = new Point(3,4);
        /* tests for point
        System.out.println(testpoint.getX()+", "+testpoint.getY());
        System.out.println(testpoint.equals(testpoint2));
        System.out.println(testpoint.equals(testpoint3));
        System.out.println(testpoint.distanceTo(testpoint2)); // Distance should be sqrt 2 or ~ 1.4142...
        System.out.println(testpoint.distanceTo(testpoint3)); // Distance should be 0.0
        */
        
        Point a = new Point (0.5248, -0.8002);
        Point b = new Point (-2.437885, 1.94);
        Point c = new Point (0.0, 0.0);
        Triangle pointTriangleTest = new Triangle(a,b,c);
        Triangle coordinateTest1 = new Triangle(0.5248, -0.8002, -2.437885, 1.94,0.0, 0.0);
        
        /*tests for perimeter 
        System.out.println(pointTriangleTest.getPerimeter());
        System.out.println(coordinateTest.getPerimeter());
        */

        /* tests for area
        System.out.println(pointTriangleTest.getArea());
        System.out.println(coordinateTest.getArea());
        */

        /* tests for classify()
        Point d = new Point (0.1, 0.1);
        Point e = new Point (-1.9, 0.1);
        Point f = new Point (-0.9, -1.632051);
        System.out.println(new Triangle(d,e,f).classify());
        Triangle coordinateEquilateral = new Triangle (0.1, 0.1, -1.9, 0.1, -0.9, -1.632051);
        Triangle coordinateIsoceles = new Triangle(-0.8, 0.8, 0.8, -0.8, 999.9, 999.9);
        Triangle coordinateScalene = new Triangle (-54.3, 84.7, 43.2, 98.443, -61.2948, 28.0);
        System.out.println(coordinateEquilateral.classify());
        System.out.println(coordinateIsoceles.classify());
        System.out.println(coordinateScalene.classify());
        */

        // tests toString()
        System.out.println(pointTriangleTest.toString());
        System.out.println(coordinateTest1.toString());



    }
}
        
