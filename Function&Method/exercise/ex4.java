//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
import java.util.Scanner;

public class ex4 
{
    public static void great(int age) 
    {
        if(age>18)
        {
            System.out.println("you are eligible to voting..........");
        }   
        else
        {
            System.out.println("You are not aligible to votiong....");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter Age :- ");
        int age = sc.nextInt();
        
        great(age);

    }    
}
