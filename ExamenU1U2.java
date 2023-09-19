/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenu1u2;
import java.util.Scanner;

/**
 *
 * @author labcca
 */
public class ExamenU1U2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner Videojuego = new Scanner(System.in);
        System.out.println("Ingrese el costo del Juego1: ");
        int Juego1 = Videojuego.nextInt();
        System.out.println("Ingrese el costo del Juego2: ");
        double Juego2 = Videojuego.nextInt();
        System.out.println("Ingrese el costo del Juego3: ");
        double Juego3 = Videojuego.nextInt();
        double descuento = Juego1*30/100;
        double descuento2 = Juego2*65/100;
        double descuento3 = Juego3*15/100;
        System.out.println("El precio del Juego1 con descuento es: " + descuento);
        System.out.println("El precio con descuento del Juego2 es: " + descuento2);
        System.out.println("El precio con descuento del Juego2 es: " + descuento3);
        Videojuego.close();

        
        // TODO code application logic here
    }
    
}