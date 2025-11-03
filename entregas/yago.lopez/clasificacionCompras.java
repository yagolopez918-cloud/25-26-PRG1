import java.util.Scanner;

class ClasificacionCompras{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eleccion;
        int precio;
        int producto = "";
        eleccion = scanner.nextInt();
        final int agregarProducto = 1;
        final int mostrarTodosProductos = 2;
        final int mostrasProductosPOrCategorias = 3;
        final int salir = 4;


        System.out.println("=== CLASIFICADOR DE PRODUCTOS ===");
        System.out.println("1. Agregar producto");
        System.out.println("2. Mostrar todos los productos");
        System.out.println("3. Mostrar productos por categoría");
        System.out.println("4. Salir");

        if(eleccion == 1){
            System.out.println("Agrege su producto");
            producto = scanner.nextLine();
            System.out.println("Cuanto cuesta ese producto?");
            precio = scanner.nextInt();
        }
        if(eleccion == 2){
            System.out.println(producto + precio);
        }
 
    }
}
 