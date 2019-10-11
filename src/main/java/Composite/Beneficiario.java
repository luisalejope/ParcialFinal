/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

public class Beneficiario {
    String nombre;
    String documento;
    String fechanaci;
    String genero;

    public Beneficiario(String nombre, String documento, String fechanaci, String genero) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechanaci = fechanaci;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getFechanaci() {
        return fechanaci;
    }

    public void setFechanaci(String fechanaci) {
        this.fechanaci = fechanaci;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
/*
    @Override
    public String toString() {
        return "Beneficiario{" + "nombre=" + nombre + ", documento=" + documento + ", fechanaci=" + fechanaci + ", genero=" + genero + '}';
    }
  */  
    
}
