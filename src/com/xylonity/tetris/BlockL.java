package com.xylonity.tetris;

/**
 * Clase que representa el bloque L, heredando de la clase principal, Block.
 */

public class BlockL extends Block {

    /**
     * Constructor que crea el bloque L y establece su forma y color (blanco).
     * @see Block
     */

    public BlockL() {

        this.bloque = new ArrayMxN(3, 2); //Define el tamaño de la matriz
        
        this.bloque.set(0,0,1);
        this.bloque.set(1,0,1);
        this.bloque.set(2,0,1);
        this.bloque.set(2,1,1);

        this.piece = new Piece(Color.WHITE, "L"); //Define el color y la señal de la pieza
    }
}