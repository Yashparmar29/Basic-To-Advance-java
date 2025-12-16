import java.util.Scanner;

public class diamond_shape 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no :- ");
        int no = sc.nextInt();

        for(int i=1 ; i<=no ; i++)
        {
            for(int j=1 ; j<=no-i ; j++)
            {
                System.out.print(" ");
            }
            for(int k=1 ; k<=2*i-1 ; k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

        for(int i=no ; i>=1 ; i--)
        {
            for(int j=1 ; j<=no-i ; j++)
            {
                System.out.print(" ");
            }
            for(int k=1 ; k<=2*i-1 ; k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
