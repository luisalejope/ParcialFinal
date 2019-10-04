/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

/**
 *
 * @author luisalejandropena
 */
public class Beneficiario {

    String Nombre;
    String Documento;
    String Born;
    String genero;

    public Beneficiario(String nombre, String documento, String fechanaci, String genero) {
        this.Nombre = nombre;
        this.Documento = documento;
        this.Born = fechanaci;
        this.genero = genero;
    }

    public Beneficiario() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    public String getBorn() {
        return Born;
    }

    public void setBorn(String Born) {
        this.Born = Born;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
