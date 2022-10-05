package comunicacion;

public class Fabula extends Escrito{
    private String ensenanza;
    private String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }

    public int palabrasTotales(int palabrasPagina){
        return palabrasPagina*getPaginas() ;
    }

    public String interpretacion(){
        return interpretacion;
    }

    public String toString(){
        String origen = super.getOrigen();
        String titulo = super.getTitulo();
        String autr = super.getAutor();
        int numeroPaginas = super.getPaginas();

        return origen + "\n" + titulo + "\n" + autr + "\n" + numeroPaginas
                + "\n" + ensenanza;
    }

    public String getEnsenanza() {
        return ensenanza;
    }
}
