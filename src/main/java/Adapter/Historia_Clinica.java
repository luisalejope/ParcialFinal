/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

import java.util.Date;

/**
 *
 * @author Julio
 */
public class Historia_Clinica {
    String Especialista;
    String Antecedentes_Familiares;
    String Diagnostico;
    String otros;
    Date Fecha;
    Medico medico;

    public Historia_Clinica() {
    }

    public String getEspecialista() {
        return Especialista;
    }

    public void setEspecialista(String Especialista) {
        this.Especialista = Especialista;
    }

    public String getAntecedentes_Familiares() {
        return Antecedentes_Familiares;
    }

    public void setAntecedentes_Familiares(String Antecedentes_Familiares) {
        this.Antecedentes_Familiares = Antecedentes_Familiares;
    }

    public String getDiagnostico() {
        return Diagnostico;
    }

    public void setDiagnostico(String Diagnostico) {
        this.Diagnostico = Diagnostico;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }
    
    
}
