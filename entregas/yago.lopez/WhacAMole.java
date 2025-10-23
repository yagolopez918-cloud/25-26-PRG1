import java.util.Scanner;

class WhacAMole{
    public static void main(String[] args) {
        final String AGUJERO = "(  )";
        final String AGUJERO_CON_MONIGOTE = "('')";
        final String AGUJERO_GOLPEADO = "[[]]";
        final String AGUJERO_MONIGOTE_GOLPEADO = "[**]";

        final int DIMENSIONES = 8;
        final int NUMERO_CASILLAS = DIMENSIONES * DIMENSIONES;
        for(int posicionImpresion = 1; posicionImpresion <= NUMERO_CASILLAS; posicionImpresion++){

            System.out.println(AGUJERO);
            if(posicionImpresion % DIMENSIONES == 0){
                System.out.println();
            }
        }
    }
}
