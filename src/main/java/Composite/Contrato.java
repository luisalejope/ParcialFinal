/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import Composite.Componente;
import Composite.Beneficiario;
import Adapter.Paciente;
import Adapter.Usuario;
import java.util.ArrayList;

public class Contrato implements Componente {

    String codigocon;
    private ArrayList<Beneficiario> beneficiarios;
    Usuario paciente=new Paciente();
    
    public Contrato() {
        this.codigocon = "";
        setBeneficiarios(new ArrayList());
    }

    public Contrato(String codigo, Usuario cotizante) {
        this.codigocon = codigo;
        this.paciente = cotizante;
        setBeneficiarios(new ArrayList());
    }

    @Override
    public String mostrarDatos() {
        String m = "";
        for (int i = 0; i < getBeneficiarios().size(); i++) {
            m = m + getBeneficiarios().get(i).getNombre() + ", " + getBeneficiarios().get(i).getDocumento() + ", " + getBeneficiarios().get(i).getFechanaci() + ", " + getBeneficiarios().get(i).getGenero() + "\n";
        }
        return "Codigo Contrato:" + getCodigocon() + "\n" + getPaciente().toString() + "\n" + m;
   
    }

    public String mostrar(String a) {
           String m = "";
        if (getCodigocon().equals(a)) {
            m = mostrarDatos();
        }
        return m;
    }

    public String getCodigocon() {
        return codigocon;
    }

    public void setCodigocon(String codigocon) {
        this.codigocon = codigocon;
    }

    public Usuario getPaciente() {
        return paciente;
    }

    public void setPaciente(Usuario paciente) {
        this.paciente = paciente;
    }

 

    public ArrayList<Beneficiario> getBeneficiarios() {
        return beneficiarios;
    }

    public void setBeneficiarios(ArrayList<Beneficiario> beneficiarios) {
        this.beneficiarios = beneficiarios;
    }

    public void addBeneficiario(Beneficiario beni) {
        getBeneficiarios().add(beni);
    }

}
