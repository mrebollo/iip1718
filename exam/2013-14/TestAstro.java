import java.util.*;
/**
 * Clase TestAstro
 * @author IIP
 * @version Parcial 1 - Curso 2013/14
 */
public class TestAstro {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        
        Astro uno = new Astro("Alfa Centauri", Astro.ESTRELLA, 4.6, 4.3);
        System.out.println(uno);
        
        System.out.println("\nIntroduce los datos de un astro");
        System.out.print("Nombre: "); String n = teclado.nextLine();
        System.out.print("Tipo (0: estrella, 1: nebulosa, 2: galaxia): ");
        int t = teclado.nextInt();
        System.out.print("Brillo: "); double b = teclado.nextDouble();
        System.out.print("Distancia: "); double d = teclado.nextDouble();
        Astro dos = new Astro(n,t,b,d);
        System.out.println(dos + " es observable " + dos.visibleCon() + "\n");
        
        int brillaMas = uno.masBrillante(dos);
        switch(brillaMas) {
            case 0: System.out.println(uno + " y " + dos + " brillan igual"); break; case 1: System.out.println(uno + " brilla m ́as que " + dos); break;
            case -1: System.out.println(dos + " brilla más que " + uno);
        }
    }
}