/** 
 * Clase Circulo: define un círculo de un determinado radio, color y
 * posición.
 * @author IIP (mrebollo) 
 * @version 1.0
 * @since 20170914 
 */ 

public class Circulo {
    /* Atributos */
    private int radio;
    private int posX;
    private int posY;
    private String color;
    
    /* Métodos */
    public Circulo () {
        radio = 50;
        posX = 0;
        posY = 0;
        color = "negro";
    }
    
    public Circulo (int r, int x, int y, String c) {
        radio = r;
        posX = x;
        posY = y;
        color = c;
    }
    
    public int getRadio () { return radio; }
    public int getPosicionX () { return posX; }
    public int getPosicionY () { return posY; }
    public String getColor () { return color; }
    
    public void setRadio (int r) { radio = r; }
    public void setPosicionX (int x) { posX = x; }
    public void setPosicionY (int y) { posY = y; }
    public void setColor (String c) { color = c; }
    
    public double calcularArea () {
        return 3.1416 * radio * radio;
    }
    
    public double calcularPerímetro () {
        return 2 * 3.1416 * radio;
    }
}
    
    




