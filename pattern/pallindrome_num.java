import java.util.Scanner;
public class pallindrome_num 
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

            for(int k=i ; k>=1 ; k--)
            {
                System.out.print(k);
            }
            for(int l=2 ; l<=i ; l++)
            {
                System.out.print(l);
            }
            System.out.println("");
        }
    }
}
