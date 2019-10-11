package servlet;

import Adapter.Medico;
import Adapter.Usuario;
import Composite.Beneficiario;
import Composite.Componente;
import Composite.Contrato;
import Facade.AdminCitas;
import Facade.Facede;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletOutputStream;

@WebServlet(
        name = "Paciente",
        urlPatterns = {"/verDisponibilidad", "/reservar", "/paciente", "/contrato", "/vercontrato","/contratocodigo"}
)

public class Paciente extends HttpServlet {

    RequestDispatcher rd;
    Facede facade = Facede.rConstructora();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String url = req.getServletPath();
        if (url.equalsIgnoreCase("/verDisponibilidad")) {
            String fecha = req.getParameter("fecha");
            String hora = req.getParameter("hora");
            String paciente = req.getParameter("paciente");
            ArrayList<Medico> lista = facade.Traer(fecha, hora);
            req.setAttribute("lista", lista);
            req.setAttribute("fecha", fecha);
            req.setAttribute("hora", hora);
            req.setAttribute("paciente", paciente);
            rd = req.getRequestDispatcher("/PedirCita2.jsp");
            rd.forward(req, resp);
        } else if (url.equalsIgnoreCase("/reservar")) {
            String fecha = req.getParameter("fecha");
            String hora = req.getParameter("horas");
            String reserva = req.getParameter("reserva");
            String paciente = req.getParameter("paciente");
            facade.AgregarCita(reserva, fecha, hora, paciente);
            ServletOutputStream out = resp.getOutputStream();
            out.write("Cita Agregada".getBytes());
            out.write(paciente.getBytes());
            out.write(reserva.getBytes());
            out.flush();
            out.close();

        } else if (url.equalsIgnoreCase("/paciente")) {
            String paciente = req.getParameter("paciente");
            req.setAttribute("paciente", paciente);
            rd = req.getRequestDispatcher("/PedirCita.jsp");
            rd.forward(req, resp);

        } else if (url.equalsIgnoreCase("/contrato")) {
            String id = req.getParameter("id");
            String login = req.getParameter("login");
            String documento = req.getParameter("documento");
            String fecha = req.getParameter("fecha");
            String genero = req.getParameter("genero");
            Beneficiario bene = new Beneficiario(login,documento,fecha,genero);
            Contrato contrato = new Contrato();
            contrato.setCodigocon(id);
            Usuario user = facade.getUsuarios().get(login);
            contrato.getBeneficiarios().add(bene);
            facade.Addcontrato(contrato);
            ServletOutputStream out = resp.getOutputStream();
            out.write("Cita Agregada".getBytes());
            out.write(login.getBytes());
            out.write(id.getBytes());
            out.flush();
            out.close();

        } else if (url.equalsIgnoreCase("/vercontrato")) {

            ServletOutputStream out = resp.getOutputStream();
            out.write(facade.verContraros().getBytes());
            out.flush();
            out.close();

        }
        else if(url.equalsIgnoreCase("/contratocodigo")){
            String codigo = req.getParameter("id");
            facade.verContratos(codigo);
            ServletOutputStream out = resp.getOutputStream();
            out.write(facade.verContrarosCodigo(codigo).getBytes());
            out.flush();
            out.close();
        
        }

    }

}
