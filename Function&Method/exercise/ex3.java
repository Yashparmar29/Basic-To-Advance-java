//Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.Scanner;

public class ex3 
{
    public static void great(int no1, int no2) 
    {
        if(no1<no2)
        {
            System.out.println("no2 is greater than no1");
        }   
        else if(no1>no2)
        {
            System.out.println("no1 is greater than no 2");
        }
        else
        {
            System.out.println("no1 is equal no2");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no 1 :- ");
        int no1 = sc.nextInt();
        System.out.print("enter no 2 :- ");
        int no2 = sc.nextInt();

        great(no1, no2);

    }
}
