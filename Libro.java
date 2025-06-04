public abstract class Libro {
    protected String titulo;
    protected Autor autor;
    protected Genero genero;
    protected double precio;

    public Libro(String titulo, Autor autor, Genero genero, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }
    public Autor getAutor() {
        return autor;
    }
    public Genero getGenero(){
        return genero;
    }
    public double getPrecio(){
        return precio;
    }

    public abstract void mostrarInfo();
}
