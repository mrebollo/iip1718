
/**
 * Write a description of class Moneda here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Moneda {
    public static void main() {
        double valor = Math.random();
        if (valor < 0.5){
            System.out.println("cara");
        } else {
            System.out.println("cruz");
        }
    }
}
