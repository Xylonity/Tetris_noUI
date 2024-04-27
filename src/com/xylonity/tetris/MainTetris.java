package com.xylonity.tetris;

/**
 * Clase principal que inicializa el Tetris desde la línea de comandos. Debe recibir 3 argumentos: filas, columnas y si se quiere jugar con color.
 */

public class MainTetris {

    /**
     * Método principal que se ejecuta al iniciar el "programa". Comprueba que los argumentos son correctos y crea una instancia del juego Tetris.
     * @param args Argumentos que se deben utilizar: filas, columnas y especificación de color ("color" o diferente)
     * @throws TetrisException Si hay un error durante la ejecución del juego
     */

    public static void main(String[] args) throws TetrisException {

        // Se comprueba que solo haya 3 argumentos

       if (args.length != 3) {
            return;
        }

        // Definición de variables, a pos de equivalerlas a los valores de los argumentos
        

        int rows;   // Variable "filas" vacía
        int columns;    // Variable "columnas" vacía
        String color;   // Variable "color" vacía

        // Comprobación de que los argumentos equivalgan su valor a las variables exitosamente

        try {
            // Comprobación de que los argumentos equivalgan su valor a las variables
            rows = Integer.parseInt(args[0]);   // La variable de filas pasa a equivaler al primer argumento
            columns = Integer.parseInt(args[1]);    // Columnas al segundo argumento
            color = args[2].toLowerCase();  // El color será el tercer argumento, pasado a minúsculas
        } catch (NumberFormatException e) { // En caso de excepción en la escritura de variables, se mostrará una alerta informativa
        	return;
        }

        // Inicialización de TetrisTextUI

        Tetris tetris;  // Se crea una variable tetris de Tetris
        TetrisTextUI ui;    // Se crea una variable ui de TetrisTextUI

        

        try {

            if (color.equals("color")) {    // En caso de que el color no sea "color", se asimilará como que se ha escrito "nocolor"
                tetris = new Tetris(rows, columns, "color");
            } else {
                tetris = new Tetris(rows, columns, "nocolor");
            }

            ui = new TetrisTextUI(tetris);  // Se le da como argumento "tetris" al constructor de TetrisTextUI
            ui.init();  // Inicialización del método init de la UI, el cual iniciará el juego "como tal"

        } catch (TetrisException e) {
            System.err.println(e.getMessage());
        }
        
    }
}