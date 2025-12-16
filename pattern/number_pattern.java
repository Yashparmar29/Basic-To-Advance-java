import java.util.Scanner;
public class number_pattern 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no :- ");
        int no = sc.nextInt();

        for(int i=1; i<=no ; i++)
        {
            for(int j=1 ; j<=no-i ; j++)
            {
                System.out.print(" ");
            }

            for(int k=1 ; k<=i ; k++)
            {
                System.out.print(k + " ");
            }
            System.out.println("");
        }
    }
}
