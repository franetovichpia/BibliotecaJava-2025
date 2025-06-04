public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Gabriel García Márquez", "Colombiano");
        Autor autor2 = new Autor("Stephen King", "Estadounidense");

        Manual manual1 = new Manual("Java Básico", autor1, Genero.TECNICO, 1200, "Programación");
        Novela novela1 = new Novela("Cien años de soledad", autor1, Genero.NOVELA, 1500, "Realismo mágico");

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(manual1);
        biblioteca.agregarLibro(novela1);

        biblioteca.mostrarLibros();
    }
}
