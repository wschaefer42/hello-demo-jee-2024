package org.example.hellodemo.jsp;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/greeting")
public class GreetingServlet extends HttpServlet {
    @Inject
    private GreetingBean greetingBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        try (var out = res.getWriter()) {
            out.println("""
                    <html lang="en">
                        <head>
                            <title>Greeting Servlet</title>
                        </head>
                    """.stripLeading());
            out.println("""
                    <body>
                        <h1>Hello Servlet</h1>
                        <form method="get">
                            <input title="My name is: " type="text" name="username" size="25"><br/>
                            <input type="submit" value="Submit">
                        </form>
                    """.stripLeading());
            var username = req.getParameter("username");
            if (username != null && !username.isBlank()) {
                out.println("<h2>Hello " + username + "</h2>");
                out.println("<p>" + greetingBean.getGreeting() + "</p>");
            }
            out.println("</body></html>");
        }
    }
}