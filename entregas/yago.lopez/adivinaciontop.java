import java.util.Scanner;
import java.util.Random;

class adivinaciontop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int intento;
        int contadorIntentos = 0;
        final int intentosMax = 10;
        boolean adivinado = false;
        System.out.println("Adivina el numero del 1 al 100");
        

        while (!adivinado && contadorIntentos <= intentosMax) {
            System.out.println("Intento #" + contadorIntentos);
            intento = scanner.nextInt();
            contadorIntentos++;
            if (numeroSecreto == intento) {
                System.out.println("has acertado en " + contadorIntentos + " intentos");
                scanner.close();
            } 
            
            if (intento < numeroSecreto) {
                System.out.println("El numero es MAYOR");
            } else if (intento > numeroSecreto) {
                System.out.println("El numero es MENOR");
            }
        }
        scanner.close();
    
    }
}