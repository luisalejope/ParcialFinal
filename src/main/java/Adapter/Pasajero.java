/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author luisalejandropena
 */
public class Pasajero extends Usuario{
private String tipo ="pasajero";
    public Pasajero(String login, String password){
    super(login, password);
   
    }

    public Pasajero() {
    }
    
    @Override
    public String GetTipousuario() {
       return tipo;
    }
    
    @Override
    public boolean ingresa(String login, String password) {
        return (login.equalsIgnoreCase(this.getLogin()) && password.equalsIgnoreCase(this.getPass()));

    }
    
   
   
}
