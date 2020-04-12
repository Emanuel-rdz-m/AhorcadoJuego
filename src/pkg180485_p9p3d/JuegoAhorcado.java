package pkg180485_p9p3d;
import java.util.Scanner;

public class JuegoAhorcado {
    private Scanner leer = new Scanner(System.in);
    char[] palabraMos;  //palabra a mostrar
    char[] palabra;     //palabra original
    private final String jugador; //nombre del jugador
    private int cont_ext=0, modo=0;   //contador de extremidades
    private String p1,p2,p3,p4; //palabras
    private int numLetras, numA;      //numero que tendra la palabra asignada
    private int numJugada;  
    private char letra; //opcion de entrada
    //private String opcPalabras[];   //lista de palabras
    public JuegoAhorcado(String jugador) {
        this.jugador = jugador;
    }
    
    public void iniciaPartida(){
        /*Metodo que da inicio a la partida.
          explica un poco del funcionamiento*/
        generaPalabras();//llena los string
        String opcPalabras[] = {p1,p2,p3,p4};  //lista de las palabras
        numA = (int)(Math.random()*4);//indice que indica la palabra escogida
        System.out.println("***Bienvenido al Ahorcado O_O");
        System.out.println(jugador);
        System.out.println("------------------------------------------");
        System.out.println("Debera de adivinar la palabra y tiene\n solo"
                + " cuatro oportunidades de fallar");
        System.out.println("------------------------------------------"
                + "\nSuerte!!\n");
        System.out.println("*Solo puedes introducir letras, no palabras");
        System.out.print("Palabra: ");
        //palabra = new char[numA];
        palabra = opcPalabras[numA].toCharArray();
        numLetras = palabra.length;
        juego();
    }
    //metodo encargado de llevar el juego completo
    private void juego(){
        palabraMos = new char[numLetras];//se define un charArray con el numLetras
        generapalabraMostrar(); //se llena la palabra con espacios (estetico)
        String pal1 = String.valueOf(palabra);
        String pal2 = null;
        //se juego conforme tenga oportunidades o la palabra sea correcta
        while(cont_ext<4 && modo==0){
            palabraMostrar();
            System.out.println("Jugada #"+(numJugada+1));
            //System.out.print("Pista: ");
            //generaPista(numA+1, numJugada+1);
            System.out.println("Ingrese Letra: ");
            letra= leer.next().charAt(0);
            mostrarLetra(letra);
            //System.out.println("\next: "+cont_ext);
            numJugada++;
            pal2 = new String(palabraMos);
            if(pal1.equals(pal2)){
                System.out.println("GANASTE!!! \nFELICIDADES :D");
                modo=1;
            }
        }
    }
    
    //llena espacios con guion bajo
    private void generapalabraMostrar(){
        for(int i=0; i<numLetras; i++){
            if( palabra[i]>='a' && palabra[i]<='z'){
                palabraMos[i]='_';
            }
        }
    }
    private void palabraOriginal(){
        for(int i=0; i<numLetras; i++){
            System.out.print(palabra[i]);
        }
        System.out.println("");
    }
    //muestra la palabra si es que lleva letras correctas
    private void palabraMostrar(){
        for(int i=0; i<numLetras; i++){
            System.out.print(palabraMos[i]+" ");
        }
        System.out.println("");
    }
    //este metodo se encarga de evaluar si la letra esta en la palabra
    private void mostrarLetra(char letra){
        boolean errorLetra=true;
        for(int i=0; i<numLetras; i++){
            if(palabraMos[i] == letra){
                //si la letra escrita esta repetida
                System.out.println("\nLetra Repetida!!");
                cont_ext++;
                mostrarErrores(cont_ext);
                errorLetra=false;
                break;
            }
            if( letra == palabra[i]){
                //si adivino una letra
                errorLetra=false;
                palabraMos[i] = letra;
            }
        }
        if(errorLetra==true){
            //si puso una letra errone, que no esta en la palabra original
            cont_ext++;
            mostrarErrores(cont_ext);
        }
    }
    
    private void generaPista(int opc, int n){
        //muetsra las pistas
        switch(opc){
            case 1:
                if(n==1){
                    System.out.println("la vez en la oficina");
                }
                if(n==2){
                    System.out.println("Forma de entrtenimiento");
                }
                if(n==3){
                    System.out.println("Dispositivo Electrico");
                }
                if(n==4){
                    System.out.println("Instalaste la ultima version");
                }
                if(n==5){
                    System.out.println("Necesita teclado");
                }
                if(n==6){
                    System.out.println("Necesita nuevos componentes?");
                }
                if(n==7){
                    System.out.println("Windows 7 murio");
                }
                if(n==8){
                    System.out.println("HP, DELL, Lenovo...");
                }
                if(n>8){
                    System.out.println("Ya no hay mas pistas! :c");
                }
                break;
            case 2:
                if(n==1){
                    System.out.println("Puedes romperla juando en casa");
                }
                if(n==2){
                    System.out.println("Se ve muy bien en la esquuina");
                }
                if(n==3){
                    System.out.println("Lleva demasiada tierra");
                }
                if(n==4){
                    System.out.println("Las plantas se ven muy bien en ella");
                }
                if(n==5){
                    System.out.println("De plastico, barro, color Naranja...");
                }
                if(n>5){
                    System.out.println("No tenemos más pistas, empieza con M");
                }
                break;
            case 3:
                if(n==1){
                    System.out.println("Color: verde");
                }
                if(n==2){
                    System.out.println("tamaño: pequeño");
                }
                if(n==3){
                    System.out.println("avanza en brincos");
                }
                if(n==4){
                    System.out.println("Habitat: ríos,lagos o estanques");
                }
                if(n==5){
                    System.out.println("Largas patas traseras");
                }
                if(n==6){
                    System.out.println("Croar!! Croar!! ");
                }
                if(n>6){
                    System.out.println("No tenemos más pistas :c");
                }
                break;
            case 4:
                if(n==1){
                    System.out.println("es un accesorio");
                }
                if(n==2){
                    System.out.println("llamativo");
                }
                if(n==3){
                    System.out.println("de colores");
                }
                if(n==4){
                    System.out.println("diferentes materiales");
                }
                if(n==5){
                    System.out.println("forma circular");
                }
                if(n==6){
                    System.out.println("se usa en la muñeca");
                }
                if(n>6){
                    System.out.println("No tenemos más pistas :c");
                }
                break;
            default:
                break;
        }
    }       
    private void mostrarErrores(int opc){
        //muestra los errores cada que se añade una extremidar cont_ext++;
        switch(opc){
            case 1:
                System.out.println("\n--------");
                System.out.println("X\nCabeza...");
                System.out.println("--------");
                break;
            case 2:
                System.out.println("\n----------");
                System.out.println("X-X\nCuerpo...");
                System.out.println("----------");
                break;
            case 3:
                System.out.println("\n----------");
                System.out.println("X-X-X\nBrazos...");
                System.out.println("----------");
                break;
            case 4:
                System.out.println("\n----------");
                System.out.println("X-X-X-X\nPiernas...");
                System.out.println("----------");
                System.out.print("HAS PERDIDO!!  :C\nPalabra: ");
                palabraOriginal();
                break;
            default:
                break;
        }
    }
    public void generaPalabras(){
        p1 = Palabras.palabra1.getPalabra();
        p2 = Palabras.palabra2.getPalabra();
        p3 = Palabras.palabra3.getPalabra();
        p4 = Palabras.palabra4.getPalabra();
        
    }
}
