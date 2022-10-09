import java.util.*;
import java.lang.*;

class regularpolygon{
    Scanner o = new Scanner(System.in);
    private int n=3;
    private double side=1;
    private double x=0;
    private double y=0;

    regularpolygon(){
        System.out.println("The number of sides are : "+n);
        System.out.println("The length of each side is : "+side);
        System.out.println("The X and Y coordinates of polygon are : "+x+" "+y);
    }
    regularpolygon(int n, double side){
        this.n=n;
        this.side=side;
        System.out.println("The number of sides are : "+n);
        System.out.println("The length of each side is : "+side);
        System.out.println("The X and Y coordinates of polygon are : "+x+" "+y);
    }
    regularpolygon(int n, double side, double x, double y){
        this.n=n;
        this.side=side;
        this.x=x;
        this.y=y;
        System.out.println("The number of sides are : "+n);
        System.out.println("The length of each side is : "+side);
        System.out.println("The X and Y coordinates of polygon are : "+x+" "+y);
    }

    void accessor(){
        System.out.println("The number of sides are : "+n);
        System.out.println("The length of each side is : "+side);
        System.out.println("The X and Y coordinates of polygon are : "+x+" "+y);
    }
    void mutator(){
        System.out.println("Enter new number of sides : ");
        int newn = o.nextInt();
        System.out.println("Enter new length of sides : ");
        double newside = o.nextDouble();
        System.out.println("Enter new X-Coordinate : ");
        double newx = o.nextDouble();
        System.out.println("Enter new Y-Coordinate : ");
        double newy = o.nextDouble();
        System.out.println("The number of sides are : "+newn);
        System.out.println("The length of each side is : "+newside);
        System.out.println("The X and Y coordinates of polygon are : "+newx+" "+newy);
        n=newn;
        side=newside;
        x=newx;
        y=newy;
    }

    double getperimeter(){
        double peri = (double)n*side;
        return peri;
    }
    double getarea(){
        double a = 180/n;
        double r = Math.toRadians(a);
        double area = ((n*side*side)/(4*Math.tan(r)));
        return area;
    }
}




public class polygon {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        // regularpolygon r1 = new regularpolygon();
        // regularpolygon r2 = new regularpolygon(2, 6);
        regularpolygon r3 = new regularpolygon(2,7,4,9);
        // regularpolygon r4 = new regularpolygon();
        // r1.accessor();
        // r2.accessor();
        // r3.accessor();
        System.out.println("Press 'yes' if you want to change the value else press 'no' : ");
        String i = t.next();
        switch(i){
            case "yes" :
            {
                r3.mutator();
                break;
            }
            case "no" : 
            {
                break;
            }
        }
        double P = r3.getperimeter();
        double A = r3.getarea();
        System.out.println("The perimeter of the plogon is : "+P);
        System.out.println("The area of polygon is : "+A);
    }
}
