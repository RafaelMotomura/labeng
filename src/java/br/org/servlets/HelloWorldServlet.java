package br.org.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "helloWorldServlet", urlPatterns = {"/helloworld"})
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response ) {
        try {
            
            String nome_parametro = request.getParameter("nome_usuario");
            String cpf_parametro = request.getParameter("cpf_usuario");
            String rg_parametro = request.getParameter("rg_usuario");
            
            PrintWriter out = response.getWriter();
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>");
            out.println("Meu primeiro Servlet");
            out.println("</title>");
            out.println("</head>");
            
            out.println("<body>");
            out.println("<h1>Hello " + nome_parametro.toUpperCase() + "</h1>");
            out.println("Your CPF is: " + cpf_parametro);
            out.println("</br>");
            out.println("Your RG is: " + rg_parametro);
            out.println("</body>");
            
            out.println("</html>");
            
        } catch (IOException ex) {
            Logger.getLogger(HelloWorldServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
