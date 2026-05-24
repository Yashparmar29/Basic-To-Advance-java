import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.net.*;

public class possible_server 
{
    public static void main(String[] args) throws Exception
    {
        ServerSocket ss = new ServerSocket(5050);
        System.out.println("Server Started...");
        Socket s = ss.accept();
        System.out.println("client connected ....");

        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        try
        {
            String n = dis.readUTF();
            int no = n.length();
            int fact = 1;
            for(int i=0;i<no;i++)
            {
                fact = fact * no;
            }

            dos.writeUTF(String.valueOf(fact));

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }    
}
