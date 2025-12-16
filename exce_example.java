import java.util.*;
class id_exception extends Exception
{
    public id_exception(String s)
    {
        super(s);
    }
}

class user_data
{
    int id;
    user_data() //throws id_exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age :- ");
        id = sc.nextInt();

        try
        {
            if(id < 18)
            {
                // System.out.println("not valid");
                throw new id_exception("you are not valid");
            }
            else
            {
                System.out.println("you are valid");
            }
        }
        catch(id_exception e)
        {
            System.out.println("Error Found :- You are not valid for voting");
        }
    }
}

public class exce_example 
{
    public static void main(String[] args)
    {
        user_data d = new user_data();
    }    
}
