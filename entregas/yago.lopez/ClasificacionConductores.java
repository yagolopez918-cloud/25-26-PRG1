import java.util.Scanner;

class ClasificacionConductores {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        System.out.println("¿Cual es tu edad?");
        int edad = scanner.nextInt();

        System.out.println("¿Tiene permiso de conducir?");
        boolean permiso = scanner.nextBoolean();
    }
}
