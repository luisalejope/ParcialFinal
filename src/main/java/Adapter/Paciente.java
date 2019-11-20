/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

import Adapter.Usuario;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Paciente extends Usuario{
    private HashMap<String, HashMap<LocalTime, String>> horario;
    private ArrayList<Historia_Clinica>Historial;
    
    public Paciente(String login,String password,String Cedula,String Nombres,String Fecha,String Direccion, String Telefono){
    super(login, password, Cedula, Nombres, Fecha, Direccion, Telefono);
     this.horario = new HashMap<>();
     super.setTipouser("Paciente");
     this.Historial = new ArrayList();
   
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
    public ArrayList<Historia_Clinica> Buscar_Citas(Date a, Date b){
        ArrayList<Historia_Clinica>H = new ArrayList();
        for (int i = 0; i < this.Historial.size(); i++) {
            if(this.Historial.get(i).getFecha().equals(a)){
                H.add(this.Historial.get(i));
                for (int j = i; j < this.Historial.size(); j++) {
                    do {
                    H.add(this.Historial.get(j));
                    }
                    while(b.before(this.Historial.get(j).getFecha())||b.equals(this.Historial.get(j).getFecha()));
                }
                
            
            
            }
            
        }
        return H;
    
    }
    public void CrearHistoria(String Especialista,String Antecedentes_Familiares,String Diagnostico,String otros,Date Fecha,Medico medico ){
        Historia_Clinica historia = new Historia_Clinica();
        historia.setAntecedentes_Familiares(Antecedentes_Familiares);
        historia.setDiagnostico(Diagnostico);
        historia.setEspecialista(Especialista);
        historia.setFecha(Fecha);
        historia.setMedico(medico);
        historia.setOtros(otros);
        this.Historial.add(historia);
    
    }

    public HashMap<String, HashMap<LocalTime, String>> getHorario() {
        return horario;
    }

    public void setHorario(HashMap<String, HashMap<LocalTime, String>> horario) {
        this.horario = horario;
    }

    public ArrayList<Historia_Clinica> getHistorial() {
        return Historial;
    }

    public void setHistorial(ArrayList<Historia_Clinica> Historial) {
        this.Historial = Historial;
    }
    
}
