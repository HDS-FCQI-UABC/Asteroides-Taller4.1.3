package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AsteroideTest {

    @Test
    void getPosicion() {
        Posicion posicion = new Posicion(10, 10);
        Asteroide asteroide = new Asteroide(posicion);
        assertEquals(posicion, asteroide.getPosicion());
    }

    @Test
    void setPosicion() {
        Posicion posicion = new Posicion(10, 10);
        Asteroide asteroide = new Asteroide(posicion);
        assertEquals(posicion, asteroide.getPosicion());

    }

    @Test
    void mover() {
        Posicion posicion = new Posicion(10, 10);
        Asteroide asteroide = new Asteroide(posicion);
        asteroide.mover(10, 10);
        assertEquals(20, asteroide.getPosicion().getX());
        assertEquals(20, asteroide.getPosicion().getY());
    }
}