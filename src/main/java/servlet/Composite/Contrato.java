/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.util.ArrayList;

/**
 *
 * @author luisalejandropena
 */
public class Contrato implements Componente {

    String codigoC;
    Cotizante coti;
    private ArrayList<Beneficiario> TioBen;

    public Contrato() {
        this.codigoC = "";
        setBeneficiarios(new ArrayList());
    }

    public Contrato(String codigoC, Cotizante coti) {
        this.codigoC = codigoC;
        this.coti = coti;
        setBeneficiarios(new ArrayList());
    }

    public String getCodigoC() {
        return codigoC;
    }

    public void setCodigocon(String codigoC) {
        this.codigoC = codigoC;
    }

    public Cotizante getCoti() {
        return coti;
    }

    public void setCotizante(Cotizante coti) {
        this.coti = coti;
    }

    public ArrayList<Beneficiario> getTioBen() {
        return TioBen;
    }

    public void setBeneficiarios(ArrayList<Beneficiario> TioBen) {
        this.TioBen = TioBen;
    }

    public void addBen(Beneficiario ben) {
        getTioBen().add(ben);
    }

    @Override
    public String mostrar() {
        String a = "";
        for (int i = 0; i < getTioBen().size(); i++) {
            a = a + getTioBen().get(i).getNombre() + ", " + getTioBen().get(i).getDocumento() + ", " + getTioBen().get(i).getBorn() + ", " + getTioBen().get(i).getGenero() + "\n";
        }

        return "Codigo Contrato:" + getCodigoC() + "\n" + getCoti().toString() + "\n" + a;

    }

    @Override
    public String mostrar2(String codigo) {

        String a = "";

        if (getCodigoC().equals(codigo)) {
            a = mostrar();
        }

        return a;

    }

}
