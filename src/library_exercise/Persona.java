package library_exercise;

import java.util.ArrayList;

public class Persona {
    public String nombre;
    private ArrayList<Libro> librosPrestados;

    public Persona(String nombre) {
        this.nombre = nombre;
        librosPrestados = new ArrayList<>();
    }

    public ArrayList<Libro> getLibrosPrestados() {
        return new ArrayList<>(librosPrestados);
    }

    public void tomarLibro(Libro libro) {
        if (libro.isPrestado()) {
            return;
        }

        libro.prestar();
        librosPrestados.add(libro);
    }

    public void devolverLibro(Libro libro) {
        libro.devolver();
        librosPrestados.remove(libro);
    }
}
