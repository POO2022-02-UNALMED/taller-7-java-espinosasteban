package comunicacion;

import java.util.ArrayList;

public class Alfabeto extends Pictograma{
    private String[] letras;
    private String interpretacion;

    public Alfabeto(String origen) {
        super(origen);
    }

    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;

    }

    public int cantidadLetras(){
        return letras.length;
    }
    public String interpretacion(){
        return interpretacion;
    }
    public String toString(){
       return "A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z";
    }
}
