/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

import Adapter.Usuario;
import java.time.LocalTime;
import java.util.HashMap;

public class Paciente extends Usuario{
    private HashMap<String, HashMap<LocalTime, String>> horario;
    
    public Paciente(String login,String password,String Cedula,String Nombres,String Fecha,String Direccion, String Telefono){
    super(login, password, Cedula, Nombres, Fecha, Direccion, Telefono);
     this.horario = new HashMap<>();
     super.setTipouser("Paciente");
   
    }
    
    public Paciente(){
    super();
    }
    
    @Override
    public void tipouser() {
        this.getLogin();
    }
    
    @Override
    public boolean Acceder(String login, String password) {
        return (login.equals(this.getLogin()) && password.equals(this.getPassword()));
    }
   
     public boolean estoyDisponible(String fecha, LocalTime hora){
        return !this.horario.containsKey(fecha) || !(this.horario.containsKey(fecha) && this.horario.get(fecha).containsKey(hora));
    }

    public String addCita(String fecha, LocalTime hora, String medico){
        if(this.horario.containsKey(fecha))
            this.horario.get(fecha).put(hora, medico);
        else
            this.horario.put(fecha,new HashMap<LocalTime, String>() {
                {
                    put(hora, medico);
                }
            });
        return "Cita anadida correctamente al paciente";
    }

    public String getCitas(String fecha){
        String disponibilidad = "\nCitas del paciente "+this.getLogin()+" para el dia "+fecha+"\n";
        boolean agenda = false;

        if(this.horario.containsKey(fecha)){
            for (LocalTime hora:this.horario.get(fecha).keySet()) {
                if(!(this.horario.get(fecha).get(hora).equals("true"))){
                    agenda = true;
                    disponibilidad += "\n"+hora + " con el medico "+this.horario.get(fecha).get(hora);
                }
            }
        }
        else
            return "El paciente no tiene citas para ese dia";

        return (agenda)?disponibilidad:"Ninguna";
    }
}

