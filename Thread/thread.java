import java.util.*;
class a extends Thread
{
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            if((i%8) == 0)
            {
                try
                {
                    Thread.sleep(1000);
                    System.out.println("Number divisible by 8 :- " + i);
                }
                catch(Exception e)
                {
                    System.out.println("Error Founded");
                }
            }
        }
    }
}
class b extends Thread
{
    public void run()
    {
        for(int i=51;i<=100;i++)
        {
            if((i%2) == 0)
            {
                try
                {
                    Thread.sleep(500);
                    System.out.println("Number divisible by 2 :- " + i);
                }
                catch(Exception e)
                {
                    System.out.println("Error Founded");
                }
            }
        }
    }
}

class c extends Thread
{
    public void run()
    {
        for(int i=1;i<=25;i++)
        {
            try
                {
                    Thread.sleep(500);
                    System.out.println("Java is Awsome");
                }
                catch(Exception e)
                {
                    System.out.println("Error Founded");
                }
        }
    }

}
public class thread 
{
    public static void main(String[] args)
    {
       a obja = new a();
       obja.start();
       try
       {
        obja.join();
       }
       catch(Exception e)
       {
        System.out.println("Error Found");
       }
       b objb = new b();
       objb.start();
       try
       {
        objb.join();
       }
       catch(Exception e)
       {
        System.out.println("Error Found");
       }
       c objc = new c();
       objc.start();
    }    
}
