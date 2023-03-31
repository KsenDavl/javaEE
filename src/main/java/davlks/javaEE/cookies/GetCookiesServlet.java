package davlks.javaEE.cookies;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "GetCookiesServlet", value = "/get-cookies")
public class GetCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();

        PrintWriter pw = response.getWriter();

        pw.println("<html>");

        for (Cookie cookie: cookies) {
            pw.println("<p>" + cookie.getName() + " : " + cookie.getValue() + "</p>");
        }

        pw.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
