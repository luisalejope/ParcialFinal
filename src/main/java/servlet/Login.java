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
        name = "Login",
        urlPatterns = {"/login"}
)

public class Login extends HttpServlet {

    //private AdminCitas admin =  AdminCitas.rConstructora();
    RequestDispatcher rd;
    Facede facade = Facede.rConstructora();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String user = req.getParameter("user");
        String pass = req.getParameter("pass");
        Usuario usuario = facade.login(user, pass);
        if (usuario != null) {
            if (usuario.getTipouser().equals("Administrador")) {
                req.setAttribute("usuario", user);
                rd = req.getRequestDispatcher("/newhtml1.html");
                rd.forward(req, resp);
            } else if (usuario.getTipouser().equals("Medico")) {
                req.setAttribute("usuario", user);
                rd = req.getRequestDispatcher("/homeMedico.html");
                rd.forward(req, resp);

            } else if (usuario.getTipouser().equals("Paciente")) {
                req.setAttribute("usuario", user);
                rd = req.getRequestDispatcher("/newhtml2.html");
                rd.forward(req, resp);
            }
        }

    }

}
