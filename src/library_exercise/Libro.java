package library_exercise;

public class Libro {
    public String titulo;
    public String autor;
    public int anio;
    private boolean prestado;

    public Libro(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        prestado = false;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void prestar() {
        prestado = true;
    }

    public void devolver() {
        prestado = false;
    }

    @Override
    public String toString() {
        return info();
    }

    public String info() {
        return "Título: " + titulo + "\n"
                + "Autor: " + autor + "\n"
                + "Año: " + anio + "\n"
                + "Disponible: " + !prestado;
    }
}
