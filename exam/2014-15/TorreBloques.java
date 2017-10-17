import java.util.Scanner;
public class TorreBloques {
    public static int dimensionValida(int dimension) {
        if (dimension < 1) return 1;
        else if (dimension > 50) return 50;
        else return dimension;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        Bloque b1 = new Bloque();
        Bloque b2 = new Bloque(Bloque.AZUL, 30, true);
        
        System.out.print("Introduce el color del bloque 3 (azul/rojo): ");
        String color = teclado.next().trim().toLowerCase();
        int codColor = Bloque.ROJO;
        if (color.equals("azul")) codColor = Bloque.AZUL;
        System.out.print("Introduce la dimensión del bloque 3 [1,50]: ");
        int dimension = dimensionValida(teclado.nextInt());
        Bloque b3 = new Bloque(codColor, dimension, false);

        System.out.println("Bloque 1: " + b1 + "\nBloque 2: " + b2 + "\nBloque 3: " + b3);
        
        boolean res = b3.puedeEstarEncimaDe(b2) && b2.puedeEstarEncimaDe(b1); 
        System.out.print("\nLa torre formada con esos tres bloques");
        if (!res) System.out.print(" NO");
        System.out.println(" es válida");
    }
}