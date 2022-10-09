import java.util.*;
import java.time.LocalDate;
import javax.sound.sampled.SourceDataLine;

class checking extends account{

}
class saving extends account{
    static int draftlimit =5000;
    void draft(){
        System.out.println("Enter amount you want to withdraw : ");
        double w = o.nextDouble();
        if(w>balance)
        {
            System.out.println("You have insufficient balance!!");
        }
        else{
            if(w<=draftlimit){
                balance=balance-w;
                System.out.println("Your new balance is : "+balance);
            }
            else{
                System.out.println("Over-draft limit execeded!!");
            }
        }
    }
}


public class pr5 {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        account a =new account();
        saving s = new saving();
        LocalDate date = LocalDate.now();
        System.out.println("Date of creation : "+date);
        System.out.println("1 : Deposit");
        System.out.println("2 : Withdraw");
        System.out.println("3 : Get Monthly Interest");
        int k = o.nextInt();
        switch(k){
            case 1 :
            {
                a.deposit();
                break;
            }
            case 2 :
            {
                s.withdraw();
            }
            case 3 :
            {
                a.getMonthlyInterest();
            }
            default:
            {
                System.out.println("ERROR");
            }
        }
    }
    

}
