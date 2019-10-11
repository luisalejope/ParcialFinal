/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Adapter.Paciente;
import Adapter.Medico;
import Facade.Facede;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;

public class AdminCitas {

    private Facede adminDatos;

    public AdminCitas(Facede datos) {
        this.adminDatos = datos;
    }
    Medico medico = new Medico();
    Paciente paciente = new Paciente();

    public String registrarDisponibilidad(String data) { // "fecha;horaInicioM;horaFinM;horaInicioT;horaFinT"

        ArrayList<LocalTime> horas = new ArrayList<>();

        String[] dataSplit = data.split(";", 5);

        for (int indx = 1; indx < dataSplit.length; indx++) {
            String[] horaYMinutos = dataSplit[indx].split(":", 2);
            horas.add(LocalTime.of(Integer.parseInt(horaYMinutos[0]), Integer.parseInt(horaYMinutos[1])));
        }

        this.medico.addDisponibilidad(dataSplit[0], horas.get(0), horas.get(1), horas.get(2), horas.get(3));

        return "Registro exitoso";

    }
/*
    public String dispoMedico(String data) { // "nombreMedico;fecha"
        String[] dataSplit = data.split(";", 2);

        if (this.adminDatos.getUsuarios().containsKey(dataSplit[0])) {
            return this.adminDatos.getUsuarios().get(dataSplit[0]).getDisponibilidad(dataSplit[1]);
        } else {
            return "El medico no se encuentra registrado";
        }
    }

    public String registraCita(String data) { //"nombreMedico;fecha;hora"
        String[] dataSplit = data.split(";", 3);
        LocalTime hora = LocalTime.of(Integer.parseInt(dataSplit[2].split(":", 2)[0]), Integer.parseInt(dataSplit[2].split(":", 2)[1]));

        if (this.adminDatos.getUsuarios().containsKey(dataSplit[0])) {

            if (this.medico.estoyDisponible(dataSplit[1], hora) && this.adminDatos.getMedicos().get(dataSplit[0]).estoyDisponible(dataSplit[1], hora)) {
                return this.adminDatos.getUsuarios().get(dataSplit[0]).addCita(dataSplit[1], hora, this.nombre) + "\n"
                        + this.adminDatos.getPacientes().get(this.nombre).addCita(dataSplit[1], hora, dataSplit[0]);
            } else {
                return ((this.adminDatos.getPacientes().get(this.nombre).estoyDisponible(dataSplit[1], hora)) ? "Paciente libre" : "Agenda del paciente ocupada") + "\n"
                        + ((this.adminDatos.getMedicos().get(dataSplit[0]).estoyDisponible(dataSplit[1], hora)) ? "Medico libre" : "Agenda del medico ocupada");
            }
        }
        return "Cita registrada";
    }

    public String consultaCitas(String fecha) {
        return this.adminDatos.getMedicos().get(this.nombre).getCitas(fecha);
    }
*/
}
