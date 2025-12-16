import java.util.*;

class a extends Thread
{
    int no;
    a(int no)
    {
        this.no = no;
        System.out.println("--- Table ---");
        for(int i=1;i<=10;i++)
        {
            System.out.println(no + " * " + i + " = " + (no*i));
        }
    }
}

class b extends Thread
{
    int no;
    b(int no)
    {
        this.no = no;
        System.out.println("--- Fibbonacci Series ---");
        System.out.print("0 , 1 ,");
        int no1 = 0;
        int no2 = 1;
        int no3 = no1 + no2;

        for(int i=3;i<=no;i++)
        {
            System.out.print(no3 + " , ");
            no1 = no2;
            no2 = no3;
            no3 = no1 + no2;
        }
    }
}



public class sample_thread 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No :- ");
        int no = sc.nextInt();

        a aobj = new a(no);
        aobj.start();
        try
        {
            aobj.join();
        }
        catch(Exception e)
        {
            System.out.println("Error Found");
        }
        b bobj = new b(no);
        bobj.start();
    }    
}
