//Write a function to print the sum of all odd numbers from 1 to n.

import java.util.Scanner;

public class ex2 
{
    public static void oddnum(int no) 
    {
        int sum1 = 0;
        for(int i=0 ; i<=no ; i++)
        {
            if(i%2 == 1)
            {
                sum1 = sum1 + i ;
            }
            else
            {
                sum1 = sum1 + 0 ;
            }
        }    
        System.out.println("sum of odd number is " + sum1);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no :- ");
        int no = sc.nextInt();
        oddnum(no);
    }    
}
