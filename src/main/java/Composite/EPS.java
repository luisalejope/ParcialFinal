/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.util.ArrayList;

public class EPS implements Componente {

    String nombre;
    private ArrayList<Componente> contratos;

    public EPS(String nombre) {
        this.nombre = nombre;
        setContratos(new ArrayList());
    }

    public EPS() {
        this.nombre = "";
        setContratos(new ArrayList());
    }

    @Override
    public String mostrarDatos() {

        String m = "";
        for (Componente c : contratos) {
            m = m + c.mostrarDatos();
        }
        return m;
    }

    @Override
    public String mostrar(String codigo) {

        String m = "";
        for (Componente c : contratos) {
            m = m + c.mostrar(codigo);
        }
        return m;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Componente> getContratos() {
        return contratos;
    }

    public void setContratos(ArrayList<Componente> contratos) {
        this.contratos = contratos;
    }

    public void addCont(Componente c) {
        getContratos().add(c);
    }
}
