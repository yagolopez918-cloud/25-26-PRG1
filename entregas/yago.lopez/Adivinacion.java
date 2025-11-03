import java.util.Scanner;
import java.util.Random;

class Adivinacion{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        boolean adivinado = false;
        int maxIntentos=10;
        int contadorIntentos = 0;
        int intento;

        System.out.println("Adivina un numero del 1 al 100");

        while(!adivinado && contadorIntentos<maxIntentos){
            System.out.print("Intento #" + (contadorIntentos + 1) + ": ");
             intento = scanner.nextInt();
             contadorIntentos++;

            if(numeroSecreto == intento){
                System.out.println("Has adivinado en" + contadorIntentos + "intentos");
            } else if(numeroSecreto > intento){
                System.out.println("Te has quedado por debajo");
            } else if(numeroSecreto < intento){
                System.out.println("Te has pasado");
            }else if(contadorIntentos>maxIntentos){
                System.out.println("Fallaste");
            } 
        }
        scanner.close();
    }
}