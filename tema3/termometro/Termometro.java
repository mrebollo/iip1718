
/**
 * Clase termométro con conversión Celsius-Farenhait.
 *
 * @author IIP 17-18 (@mrebollo)
 * @version 1.0
 * @since 20170926
 */
public class Termometro {
    private double temperatura;
    private char escala;
    
    public Termometro (double t, char e) {
        setTemperatura(t, e);
    }
    
    public double getTemperatura () { return temperatura;}
    public char getEscala () { return escala; }
    public void setTemperatura (double t, char e){
        temperatura = t;
        escala = e;
    }
    
    public void aCelsius() {
        if (escala == 'F') {
            escala = 'C';
            temperatura = (temperatura - 32) / 1.8;
        }
    }
    
    public void aFarenheit() {
        if (escala == 'C') {
            escala = 'F';
            temperatura = (temperatura * 1.8) + 32;
        }
    }
    
    public void incrementar () {
        //temperatura = temperatura + 1;
        //temperatura += 1;
        temperatura++;
    }
    
    public void decrementar () {
        temperatura--;
    }
}
