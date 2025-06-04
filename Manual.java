public class Manual extends Libro {
    private String tema;

    public Manual(String titulo, Autor autor, Genero genero, double precio, String tema) {
        super(titulo, autor, genero, precio);
        this.tema = tema;
    }

    public String getTema(){
        return tema;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("manual: " + titulo + " autor: " + autor + "tema: " + tema + "Precio: " + precio);
        
    }
}