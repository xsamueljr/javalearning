package ch01.first_steps;

public class BasicOOP {
    public static void main(String[] args) {
        // usuarios
        // nombre y edad
        Usuario usuario = obtenerUsuarioPorNombre("Pepito");

        if (usuario.esAdulto()) {
            // ...
        }
    }

    public static Usuario obtenerUsuarioPorNombre(String nombre) {
        return new Usuario(nombre, -14);
    }
}

class Usuario {
    public String nombre;
    public int edad;

    public Usuario(String nombre, int edad) {
        if (edad <= 0) {
            throw new IllegalArgumentException("La edad no puede ser 0 o negativa");
        }

        this.nombre = nombre;
        this.edad = edad;
    }

    public boolean esAdulto() {
        return this.edad >= 18;
    }
}