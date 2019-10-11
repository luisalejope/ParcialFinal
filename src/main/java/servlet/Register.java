package servlet;

import Adapter.Usuario;
import Facade.AdminCitas;
import Facade.Facede;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;

@WebServlet(
        name = "Register",
        urlPatterns = {"/registerA", "/registerM", "/registerP"}
)

public class Register extends HttpServlet {

    //private AdminCitas admin =  AdminCitas.rConstructora();
    RequestDispatcher rd;
    Facede facade = Facede.rConstructora();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String url = req.getServletPath();
        if (url.equalsIgnoreCase("/registerM")) {

            String User = req.getParameter("user");
            String Pass = req.getParameter("pass");
            String Cedula = req.getParameter("cedula");
            String Nombres = req.getParameter("nombres");
            String Fecha = req.getParameter("fecha");
            String Direccion = req.getParameter("direccion");
            String Telefono = req.getParameter("telefono");
            Usuario usuario = facade.addMedico(User, Pass, Cedula, Nombres, Fecha, Direccion, Telefono);
            if (usuario != null) {
                rd = req.getRequestDispatcher("/index.html");

            }

        } else if (url.equalsIgnoreCase("/registerP")) {
            String User = req.getParameter("user");
            String Pass = req.getParameter("pass");
            String Cedula = req.getParameter("cedula");
            String Nombres = req.getParameter("nombres");
            String Fecha = req.getParameter("fecha");
            String Direccion = req.getParameter("direccion");
            String Telefono = req.getParameter("telefono");
            Usuario usuario = facade.addPaciente(User, Pass, Cedula, Nombres, Fecha, Direccion, Telefono);

        } else if (url.equalsIgnoreCase("/registerA")) {
            String User = req.getParameter("user");
            String Pass = req.getParameter("pass");
            String Cedula = req.getParameter("cedula");
            String Nombres = req.getParameter("nombres");
            String Fecha = req.getParameter("fecha");
            String Direccion = req.getParameter("direccion");
            String Telefono = req.getParameter("telefono");
        }
    }

}
