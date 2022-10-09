import java.util.Scanner;
public class account_main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter your ID : ");
        int id = a.nextInt();
        System.out.println("Enter your balance : ");
        double balance = a.nextDouble();
        account A = new account();
        account A1 = new account(id,balance);
        A1.accessor();
        System.out.println("Press 'yes' if you want to change the value else press 'no' : ");
        String x = a.next();
        switch(x)
        {
            case "yes"  :
            {
                A1.mutator();
                break;
            }
            case "no" : 
            {
                break;
            }
        }
        double d1 = A1.getMonthlyInterestRate();
        double d2 = A1.getMonthlyInterest();
        System.out.println("Your Annual Interest Rate is : ");
        System.out.println(d1);
        System.out.println("Your Annual Interest Amount is : ");
        System.out.println(d2);
        System.out.println("Enter 1 for withdraw or 2 for deposit the amount : ");
        int i = a.nextInt();
        switch(i)
        {
            case 1 :
            {
                System.out.println("What amount of money you want to withdraw : ");
                A1.withdraw();
                break;
            }
            case 2 :
            {
                System.out.println("What amount of money you want to deposit : ");
                A1.deposit();
                break;
            } 
        }
         
    }
}
