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
public class Adapter extends Usuario{
    private Administrador admin;
   
    public Adapter(String log, String passo) {
        super();
        this.admin=new Administrador(log, passo);
    }

    public Adapter() {
        super();
        this.admin = admin;
    }

    @Override
    public String GetTipousuario() {
                String a;
                
                a="administrador";
                return a;
    }

    @Override
    public boolean ingresa(String log, String passo) {
          return this.admin.out(log, passo);
    }
    
}
