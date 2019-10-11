/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

public abstract class Usuario {

    private String login;
    private String password;
    private String Cedula;
    private String Nombres;
    private String Fecha;
    private String Direccion;
    private String Telefono;
    private String tipouser;

    abstract public boolean Acceder(String login, String password);

    abstract public void tipouser();

    public Usuario() {
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
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
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipouser() {
        return tipouser;
    }

    public void setTipouser(String tipouser) {
        this.tipouser = tipouser;
    }

    public Usuario(String login, String password, String Cedula, String Nombres, String Fecha, String Direccion, String Telefono) {
        this.login = login;
        this.password = password;
        this.Cedula = Cedula;
        this.Nombres = Nombres;
        this.Fecha = Fecha;
        this.Direccion = Direccion;
        this.Telefono=Telefono;
    }

    
}
