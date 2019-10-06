/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

import Facade.Cita;

/**
 *
 * @author luisalejandropena
 */
public class Medico extends Usuario{

    private String tipo="Medico";
    private String Nombre;
    
    
    private Cita[] C;
            
     public Medico(String login, String password) {
        super(login, password);
        this.C=new Cita[18];
    }
    
    public Medico() {
    }

    @Override
    public boolean ingresa(String login, String password) {
        return (login.equals(this.getLogin()) && password.equals(this.getPass()));
    }

    @Override
    public String GetTipousuario() {
        return tipo;
    }

    public Cita[] getC() {
        return C;
    }

    public void setC(Cita[] C) {
        this.C = C;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    

    
    
    
    
    
}
