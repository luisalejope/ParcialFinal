
package Adapter;


public class Adaptador extends Usuario {
    private Administrador Administrador;
   
    public Adaptador(String login,String password,String Cedula,String Nombres,String Fecha,String Direccion, String Telefono) {
        super();
        this.Administrador=new Administrador(login, password, Cedula, Nombres, Fecha, Direccion, Telefono);
        super.setTipouser(Administrador.getTipousuario());
    }

    public Adaptador() {
        super();
        this.Administrador = Administrador;
    }

    @Override
    public void tipouser() {
        this.Administrador.obtenerUsuario();
    }

    @Override
    public boolean Acceder(String login, String password) {
          return this.Administrador.Ingresar(login, password);
    }
}
