/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12;

import java.util.Date;

/**
 *
 * @author erodriguez-lepinamartinez
 */
public class Garaxe {

    private int numCoches;
    private Coche[] matricula = new Coche[5];

    public int getNumCoches() {
        return numCoches;
    }

    public void setNumCoches(int numeroCoches) {
        this.numCoches = numeroCoches;
    }

    public void aparcar(Coche c1) {
        if (numCoches < 5) {
            System.out.println("Hay sitio");
            numCoches++;
            for (int i = 0; i < this.matricula.length - 1; i++) {
                if (this.matricula[i] == null) {
                    Date fechahoy = new Date();
                    c1.setEntrada(fechahoy);
                    this.matricula[i] = c1;
                    break;
                }
            }
        } else {
            System.out.println("No hay sitio");
        }
    }

    public void salirGaraxe(Coche c1) {
        Date salida = new Date();
        float coste = 0;
        double horas = 2;

        for (int i = 0; i < matricula.length; i++) {
            if (matricula[i].getMatricula() == c1.getMatricula()) {
                //            horas = Math.floor(salida.getTime()-(matricula[i].getEntrada().getTime()))/3600000;
                matricula[i] = null;
                break;
            }
        }
        System.out.println("Horas: " + horas);
        Boolean primtres = false;
        while (horas > 0) {
            if (horas >= 3 && primtres == false) {
                primtres = true;
                coste += 1.5;
                horas -= 3;
            } else {
                if (horas >= 1) {
                    coste += 0.2;
                    horas -= 1;
                }
            }
        }
        System.out.println("Coste: " + coste);
    }
}
