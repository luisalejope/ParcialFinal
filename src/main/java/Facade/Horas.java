/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import java.time.LocalTime;
import java.util.ArrayList;

public class Horas {
    public void horario (String h){
    ArrayList<LocalTime> horas = new ArrayList<>();
          

            String[] dataSplit = h.split(";",5);

            for (int indx = 1; indx < dataSplit.length; indx++) {
                String[] horaYMinutos =  dataSplit[indx].split(":",2);
                horas.add(LocalTime.of(Integer.parseInt(horaYMinutos[0]),Integer.parseInt(horaYMinutos[1])));
            }
    }
}
