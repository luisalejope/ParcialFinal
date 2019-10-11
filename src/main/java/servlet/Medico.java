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
        name = "Medico",
        urlPatterns = {"/agendar","/medico"}
)

public class Medico extends HttpServlet {

    RequestDispatcher rd;
    Facede facade = Facede.rConstructora();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String url = req.getServletPath();
        if (url.equalsIgnoreCase("/agendar")) {
            String medico = (String) req.getAttribute("medico");
            String fecha = req.getParameter("fecha");
            String hI1 = req.getParameter("horaI");
            String hF1 = req.getParameter("horaF");
            String hI2 = req.getParameter("horaI2");
            String hF2 = req.getParameter("horaF2");
            facade.AgregarAgenda("nikolas", fecha, hI1, hF1, hI2, hF2);
            
        } 
        else if(url.equalsIgnoreCase("/medico")){
            String medico = req.getParameter("medico");
             req.setAttribute("medico", medico);
                rd = req.getRequestDispatcher("/Disponibilidad.jsp");
                rd.forward(req, resp);
        
        }
    }

}
