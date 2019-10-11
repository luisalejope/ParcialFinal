/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

public class Administrador {

    private String tipousuario;
    private String usuario;
    private String contrasena;
    private String Cedula;
    private String Nombres;
    private String Fecha;
    private String Direccion;
    private String Telefono;

    public Administrador(String usuario, String contrasena, String Cedula, String Nombres, String Fecha, String Direccion, String Telefono) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.Cedula = Cedula;
        this.Nombres = Nombres;
        this.Fecha = Fecha;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.tipousuario = "Administrador";
    }
    
    public boolean Ingresar(String usuario, String contrasena) {
        return (usuario.equals(this.getUsuario()) && contrasena.equals(this.getContrasena()));
    }

    public String obtenerUsuario() {
        return usuario;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usaurio) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getTipousuario() {
        return tipousuario;
    }

    public void setTipousuario(String tipousuario) {
        this.tipousuario = tipousuario;
    }

}
