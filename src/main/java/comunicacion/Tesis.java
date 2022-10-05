package comunicacion;

import java.util.ArrayList;
import java.util.Arrays;

public class Tesis extends Escrito{
    private String idea;
    private static String[] argumentos;
    private String conclusion;
    private String referencias;
    private String interpretacion;

    public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.idea = idea;
        Tesis.argumentos = argumentos;
        this.conclusion = conclusion;
        this.referencias = referencias;
        this.interpretacion = interpretacion;
    }

    public int palabrasTotales(int palabrasTotales){
        return palabrasTotales*5*getPaginas();
    }

    public String interpretacion(){
        return interpretacion;
    }


    public String getIdea() {
        return idea;
    }

    public String getConclusion() {
        return conclusion;
    }

    public static String[] getArgumentos() {
        return argumentos;
    }

    public String getReferencias() {
        return referencias;
    }

    public String toString(){
        String origen = super.getOrigen();
        String titulo = super.getTitulo();
        String autr = super.getAutor();
        int numeroPaginas = super.getPaginas();

        return origen + "\n" + titulo + "\n" + autr + "\n" + numeroPaginas
                + "\n" + idea + "\n" + argumentos.length + "\n" + conclusion + "\n" + referencias;
    }
}
