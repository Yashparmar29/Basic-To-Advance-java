import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.*;

public class Client 
{
    public static void main(String[] args) throws IOException
    {
        Socket s = new Socket("localhost",5000);
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String :- ");
        String data = sc.next();

        dos.writeUTF(data);

        String res = dis.readUTF();

        System.out.println(res);

        dis.close();
        dos.close();
        s.close();

    }    
}
