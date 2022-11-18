package org.example;

public class Asteroide {
    private Posicion posicion;

    public Asteroide(Posicion posicion) {
        this.posicion = posicion;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }
    public void mover(int x, int y) {

        this.posicion.mover(x, y);
    }
}
