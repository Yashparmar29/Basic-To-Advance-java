

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server 
{
    public static void main(String[] args) throws Exception
    {
        ServerSocket ss = new ServerSocket(5000);
        System.out.println("Server Started...");
        
        Socket s = ss.accept();
        System.out.println("Client connected...");

        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        String res = null;
        while("exit".equals(res))
        {
            res = dis.readUTF();
            System.out.println(res);  
            break; 
        }
        if((res.toString()).equalsIgnoreCase("exit"))
        {
            dos.writeUTF("Server is disconnected...");
            System.exit(0);
        }
    }
}
