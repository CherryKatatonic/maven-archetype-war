package $package;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class App implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        sce.getServletContext().setAttribute("greeting", "Hello World!");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        sce.getServletContext().removeAttribute("greeting");
    }

}
