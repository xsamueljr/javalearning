package ch01.first_steps;

public class LearnTheBasics {
    public static void main(String[] args) {
        // Comentarios
        // Líneas en el código que no son código
        // Se pueden usar para explicar cosas
        // Si tú haces así esto (sin las barras) te falla

        /*
        * Tener varias líneas
        * De comentarios
        * Sin repetir las dobles barras
        * */

        /* LEARN THE BASICS */
        // Terminología básica

        /*
        * Variable: Valor en memoria, que puede _variar_
        * Constante: Valor en memoria, que *no* puede variar
        * Función: Trozo de código reutilizable
        * - Tiene nombre, y opcionalmente puede tener parámetros (entrada) y valor de retorno (salida)
        * - Se invoca escribiendo el nombre
        * - Se escribe una vez y se puede invocar varias veces (_reutilizable_)
        *
        * Atributo: Variable dentro de una clase
        * Mé_todo: Función dentro de una clase
        * */

        // Expresiones
        // Línea que se calcula o computa
        System.out.println(5 + 2);

        // Aritméticas
        // (mates)
        System.out.println(2 + 2);
        System.out.println(2 * 3);

        // Lógicas
        // (comparaciones)
        System.out.println(5 < 2);

        System.out.println(1 + 1 == 2);

        // Variables
        // Sintaxis:
        // tipo nombre = valor;

        String nombreUsuario = "Gustavo";

        // Eso es en un solo paso 2 operaciones
        // Declaración, e inicialización

        int edad;
        edad = 20;

        String mensajeBienvenida;
        if (edad >= 80) {
            mensajeBienvenida = "Bienvenido al asilo";
        } else if (edad >= 18) {
            mensajeBienvenida = "Bienvenido al casino";
        } else {
            mensajeBienvenida = "Bienvenido al maratón de Pocoyó";
        }

        System.out.println(mensajeBienvenida);

        // Controles de flujo
        /*
        * Por defecto:
        * - Se ejecutan todas las líneas
        * - Una detrás de otra
        * - Una sola vez
        *
        * Pero eso se puede controlar
        * */

        // if (mira lo de arriba)

        // while
        // ejecutar algo **mientras** X condición se cumple
        int contador = 0;
        while (contador <= 10) {
            System.out.println(contador);
            contador = contador + 1;
        }

        // for
        // ejecutar algo X cantidad de veces concreta

        System.out.println("A continuación la misma mierda de otra forma");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        // también puede iterar sobre una colección
        // iterar es como recorrer

        String[] nombres = {"Pepito", "Rodrigo", "Fernando"};

        for (String nombre : nombres) {
            System.out.println("Hola don " + nombre);
        }

        boolean virgin = true;

        if (edad >= 80 && virgin) {
            System.out.println("Como que vas tarde ya");
        } else if (edad >= 18 && virgin) {
            System.out.println("Vaya puto fracasado");
        }
    }
}
