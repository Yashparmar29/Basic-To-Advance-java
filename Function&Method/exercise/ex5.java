//Write an infinite loop using do while condition.

import java.util.Scanner;
public class ex5
{
    public static void great(int age) 
    {
        System.out.println("1.for infinnite loop ");
        System.out.println("2.for finite loop ");
        int choice = sc.nextInt();

        while (ch == 1) 
        {
            for(int i=1 ; i>=0 ; i++)
            {
                System.out.println("***");
            }    
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no :- ");
        int no = sc.nextInt();
        great(no);
    }
}
