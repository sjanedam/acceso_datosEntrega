package main.Puntos;

public class Punto {
    protected int iX;
    protected int iY;

    // Constructor
    public Punto(int paramX, int paramY) {
        this.iX = paramX;
        this.iY = paramY;
    }
    public Punto() {
        
    }

    // GETTERS Y SETTERS
    public int getiX() {
        return iX;
    }

    public void setiX(int iX) {
        this.iX = iX;
    }

    public int getiY() {
        return iY;
    }

    public void setiY(int iY) {
        this.iY = iY;
    }

    // Métodos
    public double distancia(Punto otroPunto) {
        double dX = iX - otroPunto.getiX();
        double dY = iY - otroPunto.getiY();
        return Math.sqrt(dX*iX + dY*iY);
    }
    
    

    @Override
    public boolean equals(Object obj) {
        
        return super.equals(obj);
    }
    // To string
    @Override
    public String toString() {
        return "Punto [iX=" + iX + ", iY=" + iY + "]";
    }
}
