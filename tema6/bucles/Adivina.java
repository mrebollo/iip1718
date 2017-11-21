import java.util.Scanner;

/**
 * Write a description of class Adivina here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Adivina {
   
    public static void todoJunto(){
        int numeroOrd = (int)(Math.random() * 99 + 1);
        int intentos = 0;
        int numeroUsuario;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.print("Introduce un número: ");
            numeroUsuario = teclado.nextInt();
            if( numeroOrd < numeroUsuario){
                System.out.println("Mi número es menor");
            } else if( numeroOrd > numeroUsuario){
                System.out.println("Mi número es mayor");
            } else {
                System.out.println("¡Lo has adivinado!");
            }
            intentos++;
        }while(intentos < 10 && numeroOrd != numeroUsuario);
        
        if(numeroOrd != numeroUsuario)
            System.out.println("Lo siento, has perdido, mi número era el " + numeroOrd);
    }
    
    
    public static void main(String[] args) {
        int numeroOrd = pensarNumero(1, 100);
        int intentos = 0;
        int numeroUsuario;
        boolean adivinado;
        do{
            numeroUsuario = leerNumero();
            adivinado = numeroAdivinado(numeroOrd, numeroUsuario);
            intentos++;
        }while(intentos < 10 && !adivinado);
        
        if(!adivinado)
            System.out.println("Lo siento, has perdido, mi número era el " + numeroOrd);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private static int pensarNumero(int min, int max){
        return (int)(Math.random() * (max - min) + min);
    }
    
     private static int leerNumero() {
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.print("Introduce un número: ");
        n = teclado.nextInt();
        return n;
    }
    
    private static boolean numeroAdivinado(int ord, int us){
        boolean adivinado = false;
        if( ord < us){
            System.out.println("Mi número es menor");
        } else if( ord > us){
            System.out.println("Mi número es mayor");
        } else {
            System.out.println("¡Lo has adivinado!");
            adivinado = true;
        }
        return adivinado;
    }
    
}
