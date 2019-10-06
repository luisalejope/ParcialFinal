/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Adapter.Usuario;

/**
 *
 * @author luisalejandropena
 */
public class Cita {
    Usuario Paciente;
    String Fecha;
    int Hora;

    public Cita() {
    }

    
    public Cita(Usuario Paciente, String Fecha, int Hora) {
        this.Paciente = Paciente;
        this.Fecha = Fecha;
        this.Hora = Hora;
    }

    public Usuario getP() {
        return Paciente;
    }

    public void setP(Usuario Paciente) {
        this.Paciente = Paciente;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public int getHora() {
        return Hora;
    }

    public void setHora(int Hora) {
        this.Hora = Hora;
    }

    @Override
    public String toString() {
        return "Cita{" + "Paciente=" + Paciente + ", Fecha=" + Fecha + ", Hora=" + Hora + '}';
    }
    
    
    
}
