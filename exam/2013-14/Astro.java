import java.util.Locale;
/**
 * Clase Astro
 * @author IPP
 * @version Parcial 1 - Curso 2013/14
 */
public class Astro {
    public static final int ESTRELLA = 0;
    public static final int NEBULOSA = 1;
    public static final int GALAXIA = 2;
    private String nombre;
    private int tipo;
    private double brillo, distancia;
    
    public Astro(String n, int t, double b, double d) {
        nombre = n; tipo = t; brillo = b; distancia = d; }

    public Astro() { this("Sirius", ESTRELLA, -1.42, 8.7); }

    public double getBrillo() { return brillo; }

    public void setBrillo(double nuevoBrillo) { brillo = nuevoBrillo; }

    public boolean equals(Object o) {
        return o instanceof Astro &&
        nombre.equals(((Astro)o).nombre) && tipo == ((Astro)o).tipo &&
        brillo == ((Astro)o).brillo && distancia == ((Astro)o).distancia;
    }

    public String toString() {
        String res = nombre + ": ";
        switch(tipo) {
            case ESTRELLA: res += "Estrella "; break;
            case NEBULOSA: res += "Nebulosa "; break;
            case GALAXIA: res += "Galaxia "; break;
        }
        res += String.format(Locale.US, "(%.2f, %.2f)", brillo, distancia);
        // de manera equivalente:
        // res += "(" + (Math.round(brillo*100)/100.0) + ", "
        //            + (Math.round(distancia*100)/100.0) + ")";
        return res;
    }

    public double magnitudAbsoluta() { return brillo + 5 * Math.log10(distancia); }

    public int masBrillante(Astro otro) {
        double magAbsThis = this.magnitudAbsoluta();
        double magAbsOtro = otro.magnitudAbsoluta();
        int res = 0;
        if (magAbsThis>magAbsOtro) res = 1;
        else if (magAbsThis<magAbsOtro) res = -1;
        return res;
    }

    public String visibleCon() {
        if (brillo<5) return "a simple vista";
        else if (brillo<7) return "con prismáticos"; 
        else if (brillo<=25) return "con telescopio"; 
        else return "con grandes telescopios";
    } 
}