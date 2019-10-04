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
public class Conductor extends Usuario{

    private String tipo="conductor";
     public Conductor(String login, String password) {
        super(login, password);

    }

    public Conductor() {
    }

    @Override
    public boolean ingresa(String login, String password) {
        return (login.equals(this.getLogin()) && password.equals(this.getPass()));
    }

    @Override
    public String GetTipousuario() {
        return tipo;
    }
    
    
    
    
}
