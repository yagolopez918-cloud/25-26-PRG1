import java.util.Scanner;

class ClasificacionEdad {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cual es su edad?");
        int edad = scanner.nextInt();

        if (edad < 0) {
            System.out.println("Edad no valida");
        } else if (edad <= 5) {
            System.out.println("Primera Infancia");
        } else if (edad <= 11) {
            System.out.println("Infancia");
        } else if (edad <= 18) {
            System.out.println("Adolescencia");
        } else if (edad <= 25) {
            System.out.println("Juventud");
        } else if (edad <= 59) {
            System.out.println("Adultez");
        } else if (edad <= 100) {
            System.out.println("Persona Mayor");
        } else {
            System.out.println("Edad no valida");
        }
        scanner.close();
    }
}