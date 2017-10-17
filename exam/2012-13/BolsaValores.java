import java.util.*;

public class BolsaValores {

    public static Accion masVolatil(Accion a1, Accion a2) {
        double v1 = (a1.getMaximo()-a1.getMinimo())/a1.getMinimo();
        double v2 = (a2.getMaximo()-a2.getMinimo())/a2.getMinimo();
        if (v1>v2) return a1; 
        else return a2;
    }

    public static double intervaloAleatorio(double a, double b) {
        double m1 = Math.min(a,b), m2 = Math.max(a,b);
        return Math.random()*(m2-m1)+m1;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        /** 1 **/
        Accion a1 = new Accion("Iberdrola",12.30);
        System.out.println("Acción 1: " + a1);
        
        /** 2 **/
        System.out.print("Nombre de la empresa para la acción 2: ");
        String nom = teclado.nextLine();
        double min = intervaloAleatorio(1,100);
        double max = intervaloAleatorio(min,100);
        double ape = intervaloAleatorio(min,max);
        Accion a2 = new Accion(nom,ape,min,max);
        System.out.println("Acción 2: " + a2);
        
        /** 3 **/
        System.out.print("Valor actual para la acción 1: ");
        double act1 = teclado.nextDouble();
        a1.setActual(act1);
        if (a1.alAlza()) System.out.println("Al alza " + a1);
        else System.out.println("No esta al alza " + a1);
        
        /** 4 **/
        System.out.println("La acción mas volatil es: " + masVolatil(a1,a2));
    }
}