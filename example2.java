import java.util.*;

class student
{
    int sid,total = 0;
    String name,dept;
    int mark[] = new int[5];

    student(Scanner sc)
    {
        System.out.print("Enter Student Id :- ");
        sid = sc.nextInt();
        System.out.print("Enter Student Name :- ");
        name = sc.next();
        System.out.print("Enter Deptarment :- ");
        dept = sc.next();

        for(int i=0;i<5;i++)
        {
            System.out.print("Enter Marks :- ");
            mark[i] = sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            total += mark[i];
        }
    }
    void display()
    {
        System.out.println();
        System.out.println("---- Student Data ----");
        System.out.println("Student id :- " + sid);
        System.out.println("Student Name :- " + name);
        System.out.println("Department :- " + dept);
        //int total = 0;
        System.out.println("Total Marks :- " + total);
    }
}

public class example2 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        student s[] = new student[5];
        for(int i=0;i<5;i++)
        {
            s[i] = new student(sc);
        }
        //int id = 0;
        /*for(int i=0;i<5;i++)
        {
            if(i == 4)
            {
                if(s[i].total < s[i].total && s[id].total < s[i].total)
                {
                    id = i;
                }  
            }
            else
            {
                if(s[i].total < s[i+1].total && s[id].total < s[i+1].total)
                {
                    id = i + 1;
                }
            } 
        }*/
        System.out.print("Enter dept :- ");
        String dep = sc.next();

        for(int i=0;i<5;i++)
        {
            if(s[i].dept.equalsIgnoreCase(dep))
            {
                s[i].display();
            }
        }
        
    } 
}
