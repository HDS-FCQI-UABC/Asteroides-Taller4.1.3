package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosicionTest {

    @Test
    void getX() {
        Posicion posicion = new Posicion(10, 10);
        assertEquals(10, posicion.getX());
    }

    @Test
    void getY() {
        Posicion posicion = new Posicion(10, 10);
        assertEquals(10, posicion.getY());
    }

    @Test
    void setX() {
        Posicion posicion = new Posicion(10, 10);
        posicion.setX(20);
        assertEquals(20, posicion.getX());
    }

    @Test
    void setY() {
        Posicion posicion = new Posicion(10, 10);
        posicion.setY(20);
        assertEquals(20, posicion.getY());
    }

    @Test
    void setPosicion() {
        Posicion posicion=new Posicion(10,10);
        assertEquals(10,posicion.getX());
       // te va a marcar error con aasert Equals
        //System.out.println(posicion);
    }

    @Test
    void mover() {
        Posicion posicion=new Posicion(1,2);
        assertEquals(1,posicion.getX());
        assertEquals(2,posicion.getY());

        posicion.mover(1,1);
        assertEquals(2,posicion.getX());
        assertEquals(3,posicion.getY());
    }
}