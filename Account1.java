import java.util.*;
public class Account1 {
    Scanner c = new Scanner(System.in);
    double balance =100;
     void current_balance(){
        System.out.println("Your current balance is : "+balance);
     }
     void withdraw(){
        System.out.println("How much amount you have to withdraw : ");
        int w = c.nextInt();
        if(w<balance)
        {
            balance = balance-w;
            System.out.println("Your new balance is : "+balance);
        }
        else{
            System.out.println("You do not have sufficient balance");
        }
         
     }
     void deposit(){
        System.out.println("How much amount you have to deposit : ");
        int d = c.nextInt();
        balance = balance + d;
        System.out.println("Your new balance is : "+balance); 
     }
}
