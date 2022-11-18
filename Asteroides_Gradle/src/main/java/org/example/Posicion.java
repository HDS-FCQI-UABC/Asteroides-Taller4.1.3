package org.example;
public class Posicion {
    private int x;
    private int y;
    //position
    public Posicion(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setPosicion(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void mover(int x, int y) {
        this.x += x;
       // this.x -= x;
        this.y += y;
    }
    public String toString() {
        return "Posicion [x=" + x + ", y=" + y + "]";
    }
}
