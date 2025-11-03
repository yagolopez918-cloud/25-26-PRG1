import java.util.Scanner;
import java.util.Random;

class PiedraPapelTijera{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int eleccion = random.nextInt(3) + 1;
        int intento;
        final int tijera = 1;
        final int papel = 2;
        final int piedra = 3;
        System.out.println("Elije entre tijera(1), papel(2) y piedra(3).");
        intento = scanner.nextInt();

        if(eleccion == intento){
            System.out.println("Empate");
        }
        if(eleccion == 1 && intento == 2){
            System.out.println("Perdiste");
        }
        if(eleccion == 1 && intento == 3){
            System.out.println("Ganaste");
        }
        if(eleccion == 2 && intento == 1){
            System.out.println("Ganaste");
        }
        if(eleccion == 2 && intento == 3){
            System.out.println("Perdiste");
        }
        if(eleccion == 3 && intento == 1){
            System.out.println("Perdiste");
        }
        if(eleccion == 3 && intento == 2){
            System.out.println("Ganaste");
        }
        scanner.close();
    } 
}