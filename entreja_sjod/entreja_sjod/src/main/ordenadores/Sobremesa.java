package ordenadores;

public class Sobremesa extends Ordenadores {
	// Atributos
	private String sDescripcionTorre;

	// Constructor
	public Sobremesa(String paramDesc) {
		super();
		this.sDescripcionTorre = paramDesc;
	}
	public Sobremesa(String sCodigo, int iRam, String sCPU, double precio, String paramDesc) {
		super(sCodigo, iRam, sCPU, precio);
		this.sDescripcionTorre = paramDesc;
	}

	// To string
	@Override
	public String toString() {
		return super.toString() + "Sobremesa [sDescripcionTorre=" + sDescripcionTorre + "]";
	}

}
