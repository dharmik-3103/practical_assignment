import javax.naming.ldap.ManageReferralControl;

interface colourable{
    static  void howtocolor(){};
}
class GeometricObject implements colourable{
    static void howtocolor(){
        System.out.println("Colour of each side is re!! ");
    }
}
class square extends GeometricObject{
    private double side=0;
    square(){
        System.out.println("THe default side of square is : "+side);
        System.out.println("The default area of square is : "+side*side);
    }
    public double getside() {
        return side;
    }

    public void setside(double side) {
        this.side = side;
    }
    public void area(){
        System.out.println("The new side of square is : "+this.side);
        System.out.println("The new area of square is : "+this.side*this.side);
    }

}

public class pr9 {
    public static void main(String[] args) {
        square s = new square();
        pr9 p = new pr9();
        s.setside(10);
        s.getside();
        s.area();
    }
}

