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
public class Cotizante {

    String Nombre;
    String Documento;
    String Born;
    String Dir;
    String Tel;
    String genero;

    public Cotizante(String Nombre, String Documento, String Born, String Dir, String Tel, String genero) {
        this.Nombre = Nombre;
        this.Documento = Documento;
        this.Born = Born;
        this.Dir = Dir;
        this.Tel = Tel;
        this.genero = genero;
    }

    public Cotizante() {
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

    public String getDir() {
        return Dir;
    }

    public void setDir(String Dir) {
        this.Dir = Dir;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    @Override
    public String toString() {
        return "Cotizante" + "nombre=" + Nombre + ", Documento=" + Documento + ", Fecha de Nacimiento=" + Born + ", direccion=" + Dir + ", telefono=" + Tel + ", genero=" + genero;
    }

}
