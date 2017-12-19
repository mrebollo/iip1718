
/**
 * Write a description of class InsercionOrdenada here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InsercionOrdenada {
    public static void main(String args){
        int[] a = new int[100];
        
        for(int i = 0; i < 100; i++){
            int nuevo = (int)(Math.random() * 1000);
            insertar(a, nuevo);
        }
        
        for(int i = 0; i < 100; i++){
            System.out.print(a[i] + " ");
        }        
        System.out.println();
    }
    
    
    private static void insertar(int[] array, int valor){
        int pos = buscarPosicion(array, valor);
        crearHueco(array, pos);
        array[pos] = valor;
    }
    
    private static int buscarPosicion(int[] array, int valor){
        return 0;
    }
    
    private static void crearHueco(int[] array, int pos){
    }
    
    
}
