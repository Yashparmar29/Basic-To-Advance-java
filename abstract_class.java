import java.util.*;

abstract class user
{
    abstract void user_data();
    abstract void emp_salary();
    void print_data();
} 

class usr_data extends user
{
    int id;
    String name;
    String dept;
    Scanner sc = new Scanner(System.in);
    public void user_data()
    {
        System.out.print("Enter id :- ");
        id = sc.nextInt();
        System.out.print("Enter Name :- ");
        name = sc.next();
        System.out.print("Enter Dept :- ");
        dept = sc.next();
    }
}

public class abstract_class 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
    }    
}
