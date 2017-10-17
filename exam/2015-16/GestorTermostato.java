import java.util.Scanner;
import java.util.Locale;
/**
 *  Clase GestorTermostato: clase programa que prueba la clase Termostato
 *  @author IIP
 *  @version Primer Parcial - Curso 2015-2016
 */
public class GestorTermostato {

    public static String consejo(Termostato t) {
        String consejo = "";
        int grados = t.diferenciaConIdeal();
        if (grados == 0) { consejo = "La temperatura es adecuada"; }
        else {
            consejo = "Grados a ";
            if (t.getModo() == Termostato.FRIO) { 
                consejo = "aumentar: "; 
            } 
            else { consejo = "disminuir: "; }
            consejo += grados;
        }
        return consejo;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);    
        // Lee de teclado los datos del termostato 
        System.out.print("Modo del termostato (refrigeración/calefacción): ");
        String modo = teclado.next().trim().toLowerCase();
        int cModo = Termostato.FRIO;
        if (modo.equals("calefaccion")) { cModo = Termostato.CALOR; }
        System.out.print("Temperatura de confort del dormitorio principal: ");
        int tConf = teclado.nextInt();      
        System.out.print("Temperatura actual del dormitorio principal: ");
        double tActual = teclado.nextDouble();
       
        Termostato t = new Termostato(cModo, "dormitorio ppal", tConf, tActual);
	   
        System.out.println("Datos del termostato: " + t.toString());
       
        System.out.println("Consejo de eficiencia energética: " + consejo(t));
       
    }
}
