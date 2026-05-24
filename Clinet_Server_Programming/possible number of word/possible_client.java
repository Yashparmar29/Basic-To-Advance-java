import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class possible_client 
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        Socket s = new Socket("localhost",5050);

        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        try
        {
            System.out.print("Enter String :- ");
            String n = sc.next();

            dos.writeUTF(n);

            int ans = Integer.parseInt(dis.readUTF());

            System.out.println("possible number of write different word to String :- " + ans);

        }
        catch(Exception e)
        {
            System.out.print(e.getMessage());
        }
    }    
}
