package Ejercicio6PSP;

/**
 *
 * @author Señor Manel
 */
public class Ejercicio6PSP {

    
    public static void main(String[] args) {
        
        
        for(int i = 0;i<10;i++){
        new Operaciones("Ingreso").start();
        
        }
        for(int i = 0;i<5;i++){
        new Operaciones("Retirada").start();
        }
    }
    
}