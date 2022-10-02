package main.complejo;

public class Complejo {
    // ATRIBUTOS
    private double dPReal;
    private double dPImag;
    
    // M�TODOS
    public void asignar(double x, double y) {
        this.dPReal = x;
        this.dPImag = y;
    };
    public Complejo sumar(Complejo c1, Complejo c2) {
        Complejo c3 = new Complejo();
        
        this.dPReal = (c1.getdPReal() + c2.getdPReal());
        this.dPImag = (c1.getdPImag() + c2.getdPImag());
        
        return c3;
    };
    public void imprimir(Complejo c1) {
        System.out.println("El numero complejo es: " + c1.toString());
    };

    // CONSTRUCTORES
    public Complejo(double paramPReal, double paramPImag) {
        this.dPReal = paramPReal;
        this.dPImag = paramPImag;
    }
    public Complejo() {
    }

    // TO STRING
    @Override
    public String toString() {
        return "Complejo [dPReal=" + dPReal + ", dPImag=" + dPImag + "]";
    }

    // GETTERS AND SETTERS
    public double getdPReal() {
        return dPReal;
    }
    public void setdPReal(double dPReal) {
        this.dPReal = dPReal;
    }
    public double getdPImag() {
        return dPImag;
    }
    public void setdPImag(double dPImag) {
        this.dPImag = dPImag;
    }
}

