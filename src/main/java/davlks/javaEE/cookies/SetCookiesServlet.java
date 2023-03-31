package davlks.javaEE.cookies;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SetCookiesServlet", value = "/set-cookies")
public class SetCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie1 = new Cookie("my_id", "097");
        Cookie cookie2 = new Cookie("my_name", "Max");

        cookie1.setMaxAge(24 * 60 * 60); //сутки
        cookie2.setMaxAge(24 * 60 * 60);
//        cookie1.setMaxAge(-1); - удаление куки после закрытия браузера

        response.addCookie(cookie1);
        response.addCookie(cookie2);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
