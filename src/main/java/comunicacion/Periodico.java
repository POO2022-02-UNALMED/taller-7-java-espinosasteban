package comunicacion;

public class Periodico extends Escrito{
    private String fecha;
    private String primicia;
    private String interpretacion;

    public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.fecha = fecha;
        this.primicia = primicia;
        this.interpretacion = interpretacion;
    }

    public int palabrasTotales(int palabrasTotales){
        return 10*palabrasTotales*getPaginas();
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
                + "\n" + fecha + "\n" + primicia;
    }

    public String getFecha() {
        return fecha;
    }

    public String getPrimicia() {
        return primicia;
    }
}
