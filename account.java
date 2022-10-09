import java.util.Scanner;
import java.lang.*;
import java.time.LocalDate;
class account
{
    Scanner o =new Scanner(System.in);
    static private int id;
    protected static double balance;
    static final private double annualInterestRate=7;
    private String date;
    account()
    {
        id = 0;
        balance = 500;
        date = "3-10-2003";
    }
    account(int i,double b)
    {
        id = i;
        balance = b;
    }
    void accessor()
    {
        System.out.println("Your ID : "+id);
        System.out.println("Your balance : "+balance);
        System.out.println("Annual Interest : "+annualInterestRate);
        LocalDate date = LocalDate.now();  
        System.out.println("Date of creation : "+date);
    }
    void mutator()
    {
        System.out.println("Enter the new ID : ");
        int nid = o.nextInt();
        System.out.println("Enter the new balance : ");
        double nbalance = o.nextDouble();
        System.out.println("Your ID : "+nid);
        System.out.println("Your balance : "+nbalance);
        System.out.println("Annual Interest : "+annualInterestRate);
        LocalDate date = LocalDate.now();
        System.out.println("Date of creation : "+date);
        balance=nbalance;
    }
    double getMonthlyInterestRate()
    {
        double mir = annualInterestRate/12;
        return mir;
    }
    double getMonthlyInterest()
    {
        double mi = (annualInterestRate/12)*balance;
        return mi;
    }
    void current_balance(){
        System.out.println("Your current balance is : "+balance);
    }
    void withdraw()
    {
        System.out.println("Enter value you want to withdraw : ");
        double wd = o.nextDouble();
        System.out.println("Total balance : "+(balance-wd));
    }
    
    void deposit()
    {
        System.out.println("Enter value you want to deposit : ");
        double dp = o.nextDouble();
        System.out.println("Total balance : "+(balance+dp));
    }
}

