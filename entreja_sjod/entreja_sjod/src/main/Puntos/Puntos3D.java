package main.Puntos;

public class Puntos3D extends Punto {
    private int iZ;

    public Puntos3D(int paramX, int paramY, int paramZ) {
        super(paramX, paramY);
        this.iZ = paramZ;
    }

    // GETTERS Y SETTERS
    public int getiZ() {
        return iZ;
    }

    public void setiZ(int iZ) {
        this.iZ = iZ;
    }

    @Override
    public String toString() {
        return "Puntos3D [iZ=" + iZ + "]";
    }

    
    // Métodos
    public double distancia(Puntos3D puntos3d) {
        double dX = puntos3d.iX - getiX();
        double dY = puntos3d.iY - getiY();
        double dZ = puntos3d.iZ - getiZ();
        return Math.sqrt(dX*puntos3d.iX + dY*puntos3d.iY + dZ*puntos3d.iZ);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    

        
}
