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
        name = "Administrador",
        urlPatterns = {"/verContratos"}
)

public class Administrador extends HttpServlet {

    RequestDispatcher rd;
    Facede facade = Facede.rConstructora();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String url = req.getServletPath();
        if (url.equalsIgnoreCase("/verContratos")) {
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
