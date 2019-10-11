/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Medico extends Usuario {

    private HashMap<String, HashMap<LocalTime, String>> horario;

    public Medico(String login,String password,String Cedula,String Nombres,String Fecha,String Direccion, String Telefono) {
        super(login, password, Cedula, Nombres, Fecha, Direccion, Telefono);
        this.horario = new LinkedHashMap<>();
        super.setTipouser("Medico");
    }

    public Medico() {
        super();
    }

    @Override
    public boolean Acceder(String login, String password) {
        return (login.equals(this.getLogin()) && password.equals(this.getPassword()));
    }

    @Override
    public void tipouser() {
        this.getLogin();
    }

    public boolean addDisponibilidad(String fecha, LocalTime horaInicioM, LocalTime horaFinM, LocalTime horaInicioT, LocalTime horaFinT) {
        HashMap<LocalTime, String> horas = new LinkedHashMap<>();

        while (horaInicioM.isBefore(horaFinM)) {
            horas.put(horaInicioM, "true");
            horaInicioM = horaInicioM.plusMinutes(30);
        }

        while (horaInicioT.isBefore(horaFinT)) {
            horas.put(horaInicioT, "true");
            horaInicioT = horaInicioT.plusMinutes(30);
        }

        this.horario.put(fecha, horas);
        return true;
    }

    public String getDisponibilidad(String fecha) {
        String disponibilidad = "\nHoras en las que el médico " + this.getLogin() + " se encuentra disponible el día " + fecha + "\n";
        boolean cupo = false;

        if (this.horario.containsKey(fecha)) {
            for (LocalTime hora : this.horario.get(fecha).keySet()) {
                if (this.horario.get(fecha).get(hora).equals("true")) {
                    cupo = true;
                    disponibilidad += "\n\t" + hora;
                }
            }
        } else {
            return "No hay agenda programada para ese día";
        }

        return (cupo) ? disponibilidad : "Ninguna";
    }

    public boolean estoyDisponible(String fecha, LocalTime hora) {
        return this.horario.containsKey(fecha) && this.horario.get(fecha).containsKey(hora) && this.horario.get(fecha).get(hora).equals("true");
    }

    public String addCita(String fecha, LocalTime hora, String paciente) {
        this.horario.get(fecha).put(hora, paciente);
        return "Cita añadida correctamente al médico";
    }

    public String getCitas(String fecha) {
        String disponibilidad = "Citas del médico " + this.getLogin() + " para el día " + fecha + "\n";
        boolean agenda = false;

        if (this.horario.containsKey(fecha)) {
            for (LocalTime hora : this.horario.get(fecha).keySet()) {
                if (!(this.horario.get(fecha).get(hora).equals("true"))) {
                    agenda = true;
                    disponibilidad += "\n" + hora + " con el paciente " + this.horario.get(fecha).get(hora);
                }
            }
        } else {
            return "No hay agenda programada para ese día";
        }

        return (agenda) ? disponibilidad : "No hay citas para ese día";
    }

}
