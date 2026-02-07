
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/hello")
public class java_servlet_connection extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h1>Hello from Java Servlet 👋</h1>");
        out.println("<p>Servlet is working correctly!</p>");
    }
}
