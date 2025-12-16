import java.util.Scanner;

public class ex6 
{
    public static void infinite(int a) 
    {
        do
        {
            System.err.println("it's infinite loop......");
        }    
        while(true);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        infinite(a);
    }
    
}
