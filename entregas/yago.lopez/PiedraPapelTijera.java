import java.util.Scanner;
import java.util.Random;

class PiedraPapelTijera{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String [] opciones = {"Piedra, Papel o Tijera"};
        System.out.println(random);

        System.out.println("Jugador: ¿Piedra, Papel o Tijera?");
        String jugador = scanner.nextLine();
        

        scanner.close();
    }
}