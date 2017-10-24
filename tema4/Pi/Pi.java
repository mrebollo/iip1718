
/**
 * Cálculo del valor de PI por el método de Montecarlo.
 *
 * @author IIP 17-18 (@mrebollo)
 * @version 1.0
 * @since 20171024
 */
public class Pi {
   public static void main(){
       int radio = 1;
       int dentro = 0;
       Punto centro = new Punto();
       
       for(int i = 0; i < 1e6; i++){
           Punto p = new Punto(-1, 1);   
           if (p.distancia(centro) <= radio){
               dentro++;
            }
        }
       
       System.out.println(4 * (double)dentro / (Punto.totalPuntos()-1));
       Punto.resetTotal();
    }
}
