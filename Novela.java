public class Novela extends Libro {
    private String resumen;

    public Novela(String titulo, Autor autor, Genero genero, double precio, String resumen) {
        super(titulo, autor, genero, precio);
        this.resumen = resumen;
    }

    public String getResumen() {
        return resumen;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Novela: " + titulo + ", Autor: " + autor + ", Resumen: " + resumen + ", Precio: $" + precio);
    }
}
