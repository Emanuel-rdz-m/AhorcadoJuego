package pkg180485_p9p3d;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);  
        String nombre;
        //Impresion de datos
        System.out.println("---------------------------------------");
        System.out.println("José Emanuel Rodriguez Montes 180485");
    	System.out.println("Laboratorio: Programacion 3 Grupo: D ");
        System.out.println("01/Abril/2020");
        System.out.println("---------------------------------------");
        System.out.println("\nNombre de jugador: ");
        nombre = leer.nextLine();   //lectura de nombre
        JuegoAhorcado game = new JuegoAhorcado(nombre); 
        game.iniciaPartida();   //inicializacion del juego
    }
    
}
