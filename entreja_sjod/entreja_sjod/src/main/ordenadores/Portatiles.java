package ordenadores;

public class Portatiles extends Ordenadores {
	// Atributos
    private int iPeso;
	
    // Constructor
	public Portatiles(int paramPeso) {
    	super();
    	this.iPeso = paramPeso;
	}

	public Portatiles(String sCodigo, int iRam, String sCPU, double precio, int paramPeso) {
		super(sCodigo, iRam, sCPU, precio);
		this.iPeso = paramPeso;
	}

	@Override
	public String toString() {
		return super.toString() + "Portatiles [iPeso=" + iPeso + "]";
	}
}
