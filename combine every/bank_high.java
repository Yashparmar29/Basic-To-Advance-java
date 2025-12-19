import java.util.*;

class lowbalanceexception extends Exception
{

    public lowbalanceexception(String s) 
    {
        super(s);
    }
    
}
class user
{
    String cust_name;
    int acc_no,ch;
    double balance,dep,with;
    Scanner sc = new Scanner(System.in);
    user()
    {
        System.out.print("Enter Account no :- ");
        acc_no = sc.nextInt();
        System.out.print("Enter Cust name :- ");
        cust_name = sc.next();
        System.out.print("Enter Balance :- ");
        balance = sc.nextInt();
    }
    public void deposit()
    {
        System.out.print("Enter deposit :- ");
        dep = sc.nextInt();
        balance += dep;
        System.out.println("Available Balance :- " + balance);
    }
    void withdraw() //throws lowbalanceexception
    {
        System.out.print("Enter withdraw:- ");
        with = sc.nextInt();
        try 
        {
            if(balance < with)
            {
                throw new lowbalanceexception("Low balance .....");
            }   
            else
            {
                balance += dep;
                System.out.println("Available Balance :- " + balance);
            } 
        } 
        catch (lowbalanceexception e) 
        {
           System.out.println(e.getMessage());
        }
    }
    void display()
    {
        System.out.println("Account number :- " + acc_no);
        System.out.println("Account Holder Name :- " + cust_name);
        System.out.println("Balance :- " + balance);
    }

}
public class bank_high 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        user u[] = new user[5];
        for(int i=0;i<5;i++)
        {
            u[i] = new user();
            System.out.print("Enter choice :- ");
            int ch = sc.nextInt();
            if(ch == 1)
            {
//                System.out.println("------Operation------");
                //System.out.println("Withdraw or Deposit");
                //System.out.println("1 is for withdraw and 2 is for deposit...");
                u[i].withdraw();
            }
            else if(ch == 2)
            {
                u[i].deposit();
            }
            else
            {
                System.out.println("Enter Right choice.......");
            }
        }
        int n = 0;
        int l = 0;
        for(int i=0;i<5;i++)
        {
            int no = 0;
            if(i == 4)
            {
                no = 4;
            }
            else
            {
                no = i+1;
            }
            if(u[i].balance <= u[no].balance && u[i].balance < u[n].balance)
            {
                n = no;
            }
            if(u[i].balance >= u[no].balance && u[i].balance >= u[n].balance)
            {
                n = no;
            }
        }
        System.out.println("Highest User Info"); 
        u[n].display();
        System.out.println("Lowest User Info"); 
        u[l].display();
    }    
}
