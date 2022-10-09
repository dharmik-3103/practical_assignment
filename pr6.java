import java.util.*;
import java.lang.*;

class GeometricObject{
    double side1 =1 , side2 = 1,side3 = 1;
    double peri = side1+side2+side3;
    double P = peri/2;
    double area = Math.sqrt(P*(P-side1)*(P-side2)*(P-side3));
}
class triangle extends GeometricObject{
    triangle(){
        System.out.println("Default Triangle : ");
        System.out.println("Side1 : "+side1+"Side2 : "+side2+"Side3 : "+side3);
        System.out.println("Area of triangle : "+area);
        System.out.println("Perimeter of triangle : "+peri);

    }
    public void setside1(int side1) {
        this.side1 = side1;
    }

    public double getside1() {
        return side1;
    }

    public void setside2(int side2) {
        this.side2 = side2;
    }

    public double getside2() {
        return side2;
    }

    public void setside3(int side3) {
        this.side3 = side3;
    }

    public double getside3() {
        return side3;
    }

    public void getArea(double area) {
        this.area = area;
    }

    public double setArea() {
        return area;
    }

    public void getPerimeter(double peri) {
        this.peri = peri;
    }

    public double setPerimeter() {
        return peri;
    }

    void tostring() {
        System.out.println("The Triangle Having 3 Sides : ");
        System.out.println("Side1 : " + side1);
        System.out.println("Side2 : " + side2);
        System.out.println("Side3 : " + side3);
        System.out.println("Area of Triange Is : " + Area);
        System.out.println("Perimeter of Triange Is : " + Perimeter);
    }

    triangle(double x, double y, double z) {
        side1 = x;
        side2 = y;
        side3 = z;
        double peri = (x+y+z);
        double P = peri / 2.00;
        double Area = Math.sqrt(P * (P - x) * (P - y) * (P - z));
        System.out.println("The Specific Triangle : ");
        System.out.println("The Triangle Having 3 Sides : ");
        System.out.println("Side1 : " + x);
        System.out.println("Side2 : " + y);
        System.out.println("Side3 : " + z);
        System.out.println("Area of Triange Is : " + Area);
        System.out.println("Perimeter of Triange Is : " + peri);
    }

}


public class pr6{
    public static void main(String[] args) {
        new triangle();
        new triangle(14.0,20.0,15.0);
    }
}