package comunicacion;

public class Libro extends Escrito{
    private String co_autor;
    private String editorial;
    private String edicion;
    private String interpretacion;

    public Libro(String origen, String titulo, String autor, int paginas, String co_autor, String editorial, String edicion, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.co_autor = co_autor;
        this.editorial = editorial;
        this.edicion = edicion;
        this.interpretacion = interpretacion;
    }

    public int palabrasTotales(int palabrasPagina){
        return 2*palabrasPagina*getPaginas();
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
                + "\n" + co_autor + "\n"+ editorial+ "\n" + edicion;


    }


    public String getCo_autor() {
        return co_autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getEdicion() {
        return edicion;
    }
}
