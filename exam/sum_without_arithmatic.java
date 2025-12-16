import java.util.Scanner;

public class sum_without_arithmatic 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=0;i<b;i++)
        {
            a++;
        }
        System.out.println("sum :- " + a);
    }
        
}
