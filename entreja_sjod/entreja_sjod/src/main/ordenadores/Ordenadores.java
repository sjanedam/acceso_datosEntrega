package ordenadores;

abstract class Ordenadores {
    // Atributos
    protected String sCodigo;
    protected int iRam;
    protected String sCPU;
    protected double precio;
	
    // Constructores
    public Ordenadores(String sCodigo, int iRam, String sCPU, double precio) {
		this.sCodigo = sCodigo;
		this.iRam = iRam;
		this.sCPU = sCPU;
		this.precio = precio;
	}
    public Ordenadores() {
    	
    };

    // GETTERS Y SETTERS
	public String getsCodigo() {
		return sCodigo;
	}
	public void setsCodigo(String sCodigo) {
		this.sCodigo = sCodigo;
	}
	public int getiRam() {
		return iRam;
	}
	public void setiRam(int iRam) {
		this.iRam = iRam;
	}
	public String getsCPU() {
		return sCPU;
	}
	public void setsCPU(String sCPU) {
		this.sCPU = sCPU;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	// Métodos
	@Override
	public String toString() {
		return "Ordenadores [sCodigo=" + sCodigo + ", iRam=" + iRam + ", sCPU=" + sCPU + ", precio=" + precio + "]";
	}  
}
