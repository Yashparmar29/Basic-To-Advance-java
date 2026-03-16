import java.net.*;
import java.io.*;
import java.sql.*;
class method
{
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    int res = 0;
    void method(String id,String password)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","yash");
            String query = "select * from user where uid = ? and password = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, id);
            ps.setString(2,password);
            rs = ps.executeQuery(query);
            while(rs.next())
            {
                res = 1;
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
public class Server
{
    public static void main(String[] args)throws Exception
    {
        ServerSocket ss = new ServerSocket(5000);
        ServerSocket st = new ServerSocket(6000);
        System.out.println("Server started..");

        Socket s = ss.accept();
        System.out.println("Client connected");
        //Socket s2 = st.accept();
        //System.out.println("Client 2 connected...");

        try
        {
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            String id = dis.readUTF();
            String pass = dis.readUTF();

            String result;
            method m = new method();
            m.method(id, pass);
            if(m.res == 1)
            {
                result = "You logged in this device ...";
            }
            else
            {
                result = "you have wron id or password...";
            }
            dos.writeUTF(result);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}