package com.xylonity.tetris.strategy;

import com.xylonity.tetris.Piece;

public class NoColorStrategy implements ColorStrategy {

    protected NoColorStrategy() {
    }

    public String toString(Piece piece) {
        return piece.getSign();
    }

}
