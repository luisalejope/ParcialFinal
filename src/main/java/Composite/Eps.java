/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.util.ArrayList;

/**
 *
 * @author luisalejandropena
 */
public class Eps implements Componente {

    String Nombre;
    private ArrayList<Componente> Contra;

    public Eps(String Nombre) {
        this.Nombre = Nombre;
        setContra(new ArrayList());
    }

    public Eps() {
        this.Nombre = "";
        setContra(new ArrayList());
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public ArrayList<Componente> getContra() {
        return Contra;
    }

    public void setContra(ArrayList<Componente> Contra) {
        this.Contra = Contra;
    }

    public void addCont(Componente c) {
        getContra().add(c);
    }

    @Override
    public String mostrar() {

        String a = "";

        for (Componente c : Contra) {
            a = a + c.mostrar();
        }

        return a;

    }

    @Override
    public String mostrar2(String codigo) {

        String a = "";

        for (Componente c : Contra) {
            a = a + c.mostrar2(codigo);
        }

        return a;

    }
}
