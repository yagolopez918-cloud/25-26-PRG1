import java.util.Scanner;
import java.util.Random;

class caracruz{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int valormoneda = random.nextInt(1) + 1;
        int intento;
        final int cara = 1;
        final int cruz = 2;

        System.out.println("Elije entre Cara(1) y Cruz(2)");
        intento = scanner.nextInt();

        if(valormoneda == intento){
            System.out.println("Has ganado");
        } else {
            System.out.println("Mala suerte perdiste");
        }

    } 
}