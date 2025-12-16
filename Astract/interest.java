import java.util.*;
class user_exep extends Exception
{
    public user_exep(String s)
    {
        super(s);
    }
}
class user
{
    int acc_no,year;
    String holder_name;
    double balance = 0;
    Scanner sc = new Scanner(System.in);
    user() throws user_exep
    {
        System.out.print("enter account number :- ");
        acc_no = sc.nextInt();
        System.out.print("enter account number name :- ");
        holder_name = sc.next();
        System.out.print("enter account balance :- ");
        balance = sc.nextInt();
        if(balance <= 1000)
        {
            throw new user_exep("low balance ....");
        }
        System.out.print("enter year :- ");
        year = sc.nextInt();
        System.out.println();
        System.out.println();
    }
    void method()
    {
        if(balance <= 10000 && year <= 2)
        {
            balance += (balance * 0.09) * year;
        }
        else if(balance <= 10000 && year >= 2)
        {
            balance += (balance * 0.1) * year;
        }
        else
        {
            balance += (balance * 0.11) * year;
        }
    }
    void display()
    {
        System.out.println("account number :- " + acc_no);
        System.out.println("account holder name :- " + holder_name);
        System.out.println("balance :- " + balance);
    }
}
public class interest 
{
    public static void main(String[] args)
    {
        user s[] = new user[5];
        for(int i =0;i<5;i++)
        {
            try
            {
                s[i] = new user();
                s[i].method();
            }
            catch(user_exep e)
            {
                System.out.println(e.getMessage());
            }
        }
        int j=0;
        for(int i =0;i<5;i++)
        {
            int k;
            if(i == 4)
            {
                k=4;
            }
            else
            {
                k=i+1;
            }
            if(s[i].balance <= s[k].balance)
            {
                j=i;
            }
        }
        s[j].display();
    }    
}
