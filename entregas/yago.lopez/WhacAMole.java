import java.util.Scanner;
import java.util.Random;

class WhacAMole{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        final String Agujero = "( )";
        final String AgujeroMonigote = "(``)";
        final String AgujeroGolpeado = "[[]]";
        final String AgujeroMonigoteGolpeado = "[**]";
        final int DIMENSIONES = 4;

        for(int fila = 0; fila <4; fila++){
            for(int columna = 0; columna<4; columna++){
                System.out.println(Agujero);
            }
        }

        scanner.close();   
    }
}
