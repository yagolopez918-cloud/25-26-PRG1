import java.util.Scanner;

class practica1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=======MENU=======");
        System.out.println("1. Entrantes");
        System.out.println("2. Pricipal");
        System.out.println("3. Postres");
        System.out.println("Elije uno de esos numero");
        int numeroElejido = scanner.nextInt();



        if(numeroElejido == 1){
            System.out.println("ENTRANTES");
        } else if(numeroElejido == 2){
            System.out.println("PRINCIPALES");
        }else if(numeroElejido == 3){
            System.out.println("POSTRES");
        } else {
            System.out.println("ERROR");
        }
        scanner.close();
 }
}