/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Adapter.Medico;
import Adapter.Usuario;
import Composite.Beneficiario;
import Composite.Cotizante;
import java.util.ArrayList;

/**
 *
 * @author luisalejandropena
 */
public class Facade {

    Cotizante coti1 = new Cotizante();
    Beneficiario ben1 = new Beneficiario();
    Beneficiario ben2 = new Beneficiario();

    ArrayList<Usuario> User = new ArrayList();

    public Facade() {
    }

    public String verCita(String NombreDoc) {
        Medico medi;
        String cadena = "";
        for (int i = 0; i < User.size(); i++) {
            if (User.get(i).GetTipousuario() == "Medico") {
                medi = (Medico) User.get(i);
                if (medi.getNombre() == NombreDoc) {
                    for (int j = 0; j < medi.getC().length; j++) {
                        cadena = cadena + medi.getC()[j].toString();
                    }

                }

            }
        }
        return cadena;
    }

    public void agregarCita(String NombreDoc, String Fecha) {
        Medico medi;

        for (int i = 0; i < User.size(); i++) {
            if (User.get(i).GetTipousuario() == "Medico") {
                medi = (Medico) User.get(i);
                if (medi.getNombre() == NombreDoc) {
                    for (int j = 0; j < medi.getC().length; j++) {
                        if (medi.getC()[j] == null) {
                            Cita cita = new Cita();
                            cita.setFecha(Fecha);
                            //se acordará
                            medi.getC()[j] = cita;
                        }
                    }

                }

            }
        }

    }

    public String BuscarFecha(String Fecha) {

        Medico medi;
        String cadena = "";
        for (int i = 0; i < User.size(); i++) {
            if (User.get(i).GetTipousuario() == "Medico") {
                medi = (Medico) User.get(i);
                for (int j = 0; i < medi.getC().length; j++) {
                    if (medi.getC()[j].getFecha() == Fecha) {
                        cadena = cadena + medi.getC()[j].toString();

                    }
                }

            }
        }
        return cadena;
    }

    public String BuscarFecha2(String Fecha) {

        Medico medi;
        String cadena = "";
        for (int i = 0; i < User.size(); i++) {
            if (User.get(i).GetTipousuario() == "Medico") {
                medi = (Medico) User.get(i);
                for (int j = 0; i < medi.getC().length; j++) {
                    if (medi.getC()[j].getFecha() == null) {
                        cadena = cadena + medi.getC()[j].toString();

                    }
                }

            }
        }
        return cadena;
    }
}
