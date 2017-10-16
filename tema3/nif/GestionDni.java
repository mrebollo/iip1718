
/**
 * Write a description of class GestionDni here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GestionDni {
    public static void main () {
        Nif miNif;
        miNif = new Nif(25451023);
        
        char letra = miNif.getLetra();
        int dni = miNif.getNumero();
        System.out.println( dni + "-" + letra );
        System.out.println(miNif);
    }
}
