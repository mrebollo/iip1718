/** 
 * Clase Circulo: define un círculo de un determinado radio, color y
 * posición.
 * @author IIP (mrebollo) 
 * @version 2.0
 * @since 20170914 
 */ 

public class Circulo {
    /* Atributos */
    private Punto centro;
    private double radio;
    private String color;
    
    /* Métodos */
    public Circulo () {
        centro = new Punto();
        radio = 50;
        color = "negro";
    }
   
    
    public double getRadio () { return radio; }
    public String getColor () { return color; }
    public Punto getCentro(){ return centro;}
    
    public void setRadio (double r) { radio = r; }
    public void setColor (String c) { color = c; }
    public void setCentro (Punto p) { centro = p; }
    
    public double calcularArea () {
        return Math.PI * Math.pow(radio,2);
    }
    
    public double calcularPerímetro () {
        return 2 * Math.PI * radio;
    }
    
    public double calcularVolumen () {
        return 4 / 3 * Math.PI * Math.pow(radio,3);
    }
    
}
    
    




