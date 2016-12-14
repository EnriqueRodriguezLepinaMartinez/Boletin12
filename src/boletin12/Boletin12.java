/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12;

/**
 *
 * @author erodriguez-lepinamartinez
 */
public class Boletin12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Garaxe gar1 = new Garaxe();
        Coche c1 = new Coche("2405 03M");
        gar1.aparcar(c1);
        gar1.salirGaraxe(c1);
    }

}
