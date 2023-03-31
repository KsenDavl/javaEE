package davlks.javaEE.cookies;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "DeleteCookiesServlet", value = "/delete-cookies")
public class DeleteCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //создаем куки с таким же именем, как у куки, которую хотим удалить -> перезаписывем
        Cookie cookie = new Cookie("my_name", "");
        cookie.setMaxAge(0);

        response.addCookie(cookie);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
