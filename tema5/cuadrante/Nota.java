
/**
 * Write a description of class Nota here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Nota {
    // instance variables - replace the example below with your own
   private double nota;
   
   public int textoANumero() {
       int valor = 0;
       
       return valor;
    }
    
    
    
    public String toString(){
        String res = "";
        if(nota < 5)
            res = "Insuficiente";
        else if( nota < 7)
            res = "Aprobado";
        else if (nota < 9)
            res = "Notable";
        else
            res = "Sobresaliente";
        
        return res;
    }
}
