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
public class Administrador {
    
    private String type; 
    private String user;
    private String contras;

    public Administrador(String usuario, String contras) {
        
        this.user = usuario;
        this.contras = contras;
    }

    public boolean out(String usuario, String contras){
        boolean islogin=false;
        
        if(this.getUser().equalsIgnoreCase(usuario)&& this.getContras().equalsIgnoreCase(contras)){
            islogin=true;
        }else
            islogin=false;
          return islogin;
    }

    public String getType() {
        return type="administrador";
    }

    public void setType(String type) {
        this.type = "administrador";
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContras() {
        return contras;
    }

    public void setContras(String contras) {
        this.contras = contras;
    }

    
    
    

    
}
