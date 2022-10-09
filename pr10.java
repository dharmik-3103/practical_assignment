import java.util.*;
import java.lang.*;

class square{
    protected double side;
    public double getside(){
        return side;
    }
    public void setside(double side)
    {
        this.side=side;
    }
    public void area(){
        System.out.println("The side of square is : "+this.side);
        System.out.println("The area of square is : "+this.side*this.side);
    }
}
class comparablesquare extends square{
    protected double nside;
    public double ngetnside(){
        return nside;
    }
    public void nsetside(double nside)
    {
        this.nside=nside;
    }
    public void narea(){
        System.out.println("The side of square is : "+this.nside);
        System.out.println("The area of square is : "+this.nside*this.nside);
    }
}
class test extends comparablesquare{
    public void comp(){
        if(side==nside)
        {
            System.out.println("The square and comparablesquare are same !!");
        }
        else{
            System.out.println("The square and comparablesquare are not same !!");
        }
    }
}

public class pr10 {
    public static void main(String[] args) {
        test t = new test();
        t.setside(10);
        t.getside();
        t.area();
        t.nsetside(10);
        t.ngetnside();
        t.narea();
        t.comp();
    }
}
