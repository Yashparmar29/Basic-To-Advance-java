import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.*;


public class Server 
{
    public static void main(String[] args) throws Exception
    {
        ServerSocket ss = new ServerSocket(5000);
        System.out.println("Server Started...");
        
        Socket s = ss.accept();
        System.out.println("Client connected....");

        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        String str = dis.readUTF();

        StringBuffer new_str = new StringBuffer(str);

        new_str = new_str.reverse();
        System.out.println(new_str);
        String result;
        if(str.equalsIgnoreCase(new_str.toString()))
        {
            result = "Your String is palindrome...";   
        }
        else
        {
            result = "Your String is not palindrome";
        }
        dos.writeUTF(result);

        dos.close();
        dis.close();
        s.close();
        ss.close();

            
    }
}
