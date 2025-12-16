import java.util.*;
class emp
{
    Scanner sc = new Scanner(System.in);
    int emp_no;
    String emp_name;
    String emp_class,designation;

    //you can user to input
    void get()
    {
        System.out.print("enter emp no :- ");
        emp_no = sc.nextInt();
        System.out.print("enter emp name :- ");
        emp_name = sc.next();
        System.out.println("1 -> class 1");
        System.out.println("2 -> class 2");
        System.out.println("3 -> class 3");
        System.out.print("enter class :- ");
        int ch = sc.nextInt();
        if(ch == 1)
        {
            emp_class = "class 1";
        }
        else if(ch == 2)
        {
            emp_class = "class 2";
        }
        else 
        {
            emp_class = "class 3";
        }
        System.out.print("enter designation :- ");
        designation = sc.next();
        System.out.println();
    }
    void show()
    {
        System.out.println("emp no :- " + emp_no);
        System.out.println("emp name :- " + emp_name);
        System.out.println("emp class :- " + emp_class);
        System.out.println("emp designation :- " + designation);
    }
}

public class emp_details 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        emp e[] = new emp[5];
        for(int i=0;i<5;i++)
        {
            e[i] = new emp();
            e[i].get();
        }
          System.out.println("1 -> class 1");
        System.out.println("2 -> class 2");
        System.out.println("3 -> class 3");
        System.out.println("enter which class member you display :- ");
        int ch = sc.nextInt();
        for(int i=0;i<5;i++)
        {
            if(ch == 1)
            {
                if(e[i].emp_class.equals("class 1")) 
                {
                    System.out.println("class 1 user of " + i);
                    e[i].show();
                    System.out.println();
                }
            }
            else if(ch == 2)
            {
                if(e[i].emp_class.equals("class 2")) 
                {
                    System.out.println("class 1 user of " + i);
                    e[i].show();
                    System.out.println();
                }
            }
            else if(ch == 3)
            {
                if(e[i].emp_class.equals("class 3")) 
                {
                    System.out.println("class 1 user of " + i);
                    e[i].show();
                    System.out.println();
                }
            }
            else
            {
                System.out.println("enter right choice.");
            }
        }
        
    }    
}

