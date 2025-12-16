//Enter 3 numbers from the user & make a function to print their average.

import java.util.Scanner;
public class ex1
{
    public static void ave(int no1,int no2,int no3)
    {
        int sum = no1 + no2 + no3 ;
        System.out.println("average of sum :- " + sum/3);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no1 :- ");
        int no1 = sc.nextInt();
        System.out.print("enter no2 :- ");
        int no2 = sc.nextInt();
        System.out.print("enter no3 :- ");
        int no3 = sc.nextInt();
        ave(no1,no2,no3);
        
    }
}