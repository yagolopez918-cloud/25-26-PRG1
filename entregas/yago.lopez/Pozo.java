import java.util.Scanner;

class Pozo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        final int PROFUNDIDAD_POZO = 20;
        final String BORDE_SUPERIOR = "[_]              [_]";
        final String PARED = (" []:. :. :. :. :.[] ");
        final String BORDE_INFERIOR = (" [][][][][][][][][] ");
        final String SEPARADOR = ("_ __ ");
        System.out.println("Profundidad del agua?");
        final int PROFUNDIDAD_AGUA = scanner.nextInt();
        final String AGUA = (" []~~~~~~~~~~~~~~[] ");
        System.out.println("Que profundidad esta el caracol?");
        final int PROFUNDIDAD_CARACOL = scanner.nextInt();
        
        boolean caracolMuerto = PROFUNDIDAD_CARACOL >= (PROFUNDIDAD_POZO - PROFUNDIDAD_AGUA);
        final String CARACOL = caracolMuerto ? " []~~~~_@)_-,~~~~[]" : " []    _@)_/'    []";
        
        System.out.println(BORDE_SUPERIOR);
        for(int profundidad = 0;profundidad <= PROFUNDIDAD_POZO; profundidad = profundidad + 1){

            if(profundidad == PROFUNDIDAD_CARACOL){
                System.out.print(CARACOL);
            } else if (profundidad > PROFUNDIDAD_POZO - PROFUNDIDAD_AGUA){
                System.out.print(AGUA);
            } else {
                System.out.print(PARED);
            }
            System.out.println(SEPARADOR + profundidad);
        }
        System.out.println(BORDE_INFERIOR);
        if (caracolMuerto){
            System.out.println("El carcacol esta muerto!");
        }
        scanner.close();
    } 
}


