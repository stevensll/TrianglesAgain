public class Triangle {
    private Point v1,v2,v3;
    public Triangle(Point a, Point b, Point c){
        v1= a;
        v2 = b;
        v3 = c;
    }
    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        Point a = new Point (x1,y1);
        Point b = new Point (x2,y2);
        Point c = new Point (x3,y3);
    }

/*
c) Four accessors:  (the first three are the same as the old assignment with rounding modifications)

public double getPerimeter() 
   Return the area without any rounding.

public double getArea() 
   Return the area using Heron's formula without any rounding.

public String classfiy() 
    Return the "equilateral" "isosceles" or "scalene" Round distances to the nearest tenthousandths for your classifications.

public String toString() 
     The format should be "v1(23.0, 4.0) v2(-2.3, 5.001) v3(5.0, 0.52)"

-One mutator
public void setVertex(int index, Point newP) - replace the specified Point (0,1, or 2) with the new Point
*/
}
