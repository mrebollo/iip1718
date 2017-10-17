public class GestorEdificios {
    public static void main(String[] args) { 
        Edificio e1 = new Edificio("1G", "ETSINF", Edificio.ESCUELA, 
            new Punto(39.4826, -0.3470));
        Edificio e2 = new Edificio();
        
        int comp = e1.masCercaRectorado(e2);
        String res = "El edificio más cercano a rectorado es ";
        if (comp == -1) { res += e1; } 
        else if (comp == 1) { res += e2; } 
        else { res = "Ambos edificios están igual de cerca de rectorado"; }
        System.out.println(res);	
    }
}
