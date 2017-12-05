
/**
 * Write a description of class Astro here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Astro {
   public static final int ESTRELLA = 0;
   public static final int NEBULOSA = 1;
   public static final int GALAXIA = 2;
   private String nombre;
   private int tipo;
   private double brillo;
   private double distancia;
   
   public Astro (){
       nombre = "Sirius";
       tipo = ESTRELLA;
       brillo = -1.42;
       distancia =8.7;
    }
    
    public Astro (String nom, int t, double bri, double dist){
       nombre = nom;
       tipo = t;
       brillo = bri;
       distancia = dist;
    }
}
