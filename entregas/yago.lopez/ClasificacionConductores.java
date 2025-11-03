import java.util.Scanner;

class ClasificacionConductores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca su edad");
        int edad = scanner.nextInt();

        System.out.println("¿Tiene permiso de conducir? true/false");
        boolean permisoConducir = scanner.nextBoolean();

        if(edad<18){
            System.out.println("Menor de Edad");
        }
        if(edad>=18 && permisoConducir==false){
            System.out.println("Mayor sin licencia");
        }
        if(edad>=18 && edad<=19 && permisoConducir==true){
            System.out.println("Conductor novel");
        }
        if(edad>20 && edad<=27 && permisoConducir==true){
            System.out.println("Conductor experimentado");
        }
        if(edad>28 && edad<=64 && permisoConducir==true){
            System.out.println("Conductor senior");
        }
        if(edad>=65 && permisoConducir==true){
            System.out.println("Conductor jubilado");
        }
        scanner.close();

    }
}
