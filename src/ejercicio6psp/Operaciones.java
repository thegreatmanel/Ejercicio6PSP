/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6PSP;

/**
 *
 * @author Señor Manel
 */
public class Operaciones extends Thread {

    static int DINERO = 10;
    String movimientos;

    public Operaciones(String str) {
        super(str);
        this.movimientos = str;
    }

    synchronized void Ingreso() {
        DINERO++;
        System.out.println("Ingresado");
        System.out.println(DINERO);
        
    }

    synchronized void Retirada() {
        DINERO--;
        System.out.println("Retirado");
        System.out.println(DINERO);
    }

    @Override
    public void run() {
        if ("Ingreso".equals(movimientos)) {
            Ingreso();
           
        }
        if ("Retirada".equals(movimientos)) {
            Retirada();
           
        }

       
    }

}