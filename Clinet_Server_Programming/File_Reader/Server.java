import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server 
{
    public static void main(String[] args) throws Exception
    {
        ServerSocket ss = new ServerSocket(5000);
        System.out.println("Server Started ....");

        Socket s = ss.accept();
        System.out.println("Client connected....");

        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        String f_name = dis.readUTF();

        try
        {
            BufferedReader br = new BufferedReader(new FileReader(f_name));
            String line;
            StringBuffer res = new StringBuffer();
            while((line = br.readLine()) != null)
            {
                res.append(line).append("\n");
            }
            String m = res.toString();
            dos.writeUTF(m);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

        dos.close();
        dis.close();
        s.close();
        ss.close();

    } 
}
