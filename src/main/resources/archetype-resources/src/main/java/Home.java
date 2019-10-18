package $package;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Home", urlPatterns = {"", "/home"})
public class Home extends HttpServlet {

    private String greeting;

    @Override
    public void init() throws ServletException {
        super.init(getServletConfig());
        greeting = getServletConfig().getInitParameter("greeting");
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.setAttribute("greeting", greeting);
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }

}
