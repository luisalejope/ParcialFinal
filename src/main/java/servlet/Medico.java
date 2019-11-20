package servlet;

import Adapter.Historia_Clinica;
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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletOutputStream;

@WebServlet(
        name = "Medico",
        urlPatterns = {"/agendar", "/medico","/historiaPaciente","/historiaNombre"}
)

public class Medico extends HttpServlet {

    RequestDispatcher rd;
    Facede facade = Facede.rConstructora();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String url = req.getServletPath();
        if (url.equalsIgnoreCase("/agendar")) {
            String medico = req.getParameter("medico");
            String fecha = req.getParameter("fecha");
            String hI1 = req.getParameter("horaI");
            String hF1 = req.getParameter("horaF");
            String hI2 = req.getParameter("horaI2");
            String hF2 = req.getParameter("horaF2");
            facade.AgregarAgenda(medico, fecha, hI1, hF1, hI2, hF2);

        } else if (url.equalsIgnoreCase("/medico")) {
            String medico = req.getParameter("medico");
            req.setAttribute("medico", medico);
            rd = req.getRequestDispatcher("/Disponibilidad.jsp");
            rd.forward(req, resp);

        } else if (url.equalsIgnoreCase("/historiaPaciente")) {
            
            try {
            Date Fecha=new SimpleDateFormat("dd/MM/yyyy").parse(req.getParameter("fecha"));
            String paciente = req.getParameter("paciente");
            String Especialista = req.getParameter("especialista");
            String Antecedentes_Familiares = req.getParameter("a_familiares");
            String Diagnostico = req.getParameter("diagnostico");
            String otros = req.getParameter("otros");
            Adapter.Medico medico =(Adapter.Medico) req.getAttribute("medico");

            facade.agregarHistoria(paciente, Especialista, Antecedentes_Familiares, Diagnostico, otros, Fecha, medico);
             rd = req.getRequestDispatcher("/Disponibilidad.jsp");
            rd.forward(req, resp);
            } catch (ParseException ex) {
                Logger.getLogger(Medico.class.getName()).log(Level.SEVERE, null, ex);
                 ServletOutputStream out = resp.getOutputStream();
            out.write(ex.toString().getBytes());
            out.flush();
            out.close();
            }
            //a
            
        }
        else if (url.equalsIgnoreCase("/historiaNombre")){
            String nombre = req.getParameter("nombre");
          ArrayList<Historia_Clinica>h =  facade.TraerPorNombre(nombre);
          h.get(0).getDiagnostico();
          
            
         
        
        }
    }

}
