import java.util.*;

public class pr_3_account {
    public static void main(String[] args) {
        Account1 a = new Account1();
        Scanner o = new Scanner(System.in);
        int[] acc_array = {0,1,2,3,4,5,6,7,8,9};
        double balance =100;
        Arrays.sort(acc_array);
        System.out.println("Enter ID : ");
        int i = o.nextInt();
        int retVal = Arrays.binarySearch(acc_array,i);
        boolean res = retVal > 0 ? true : false;

        if(res==true)
        {
            System.out.println("1: Current balance");
            System.out.println("2: Withdrawing money");
            System.out.println("3: Depositing money");
            System.out.println("4: Exit");
            int j = o.nextInt();
            switch(j){
                case 1 : 
                {
                    a.current_balance();
                    break;
                }
                case 2 :
                {
                    a.withdraw();
                    break;
                }
                case 3 :
                {
                    a.deposit();
                    break;
                }
                case 4 :
                {
                    break;
                }
                case 99 :
                {
                    break;
                }
            }

        }
        else{
            System.out.println("Enter valid ID number!!!");
        }
    }
}
