
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.*;
import java.util.Scanner;
public class Client 
{
    public static void main(String[] args) throws Exception
    {
        Socket s = new Socket("localhost",5000);
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        String data = null;
        Scanner sc = new Scanner(System.in);
        while("exit".equalsIgnoreCase(data))
        {
            System.out.print("Enter String :- ");
            data = sc.next();
            dos.writeUTF(data);
            break;
        }
        String res = dis.readUTF();
        System.out.println(res);

        if("exit".equalsIgnoreCase(res))
        {
            System.out.println("System exit ....");
            System.exit(0);
        }
    }    
}
