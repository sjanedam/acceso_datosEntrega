package ordenadores;

public class OrdenadorTestJane {

	public static void main(String[] args) {
		Portatiles miPort1 = new Portatiles("1234LWD", 3, "1234QWE", 2130.99, 3);
		Portatiles miPort2 = new Portatiles("2345LWD", 4, "2345QWE", 1245.55, 5);
		
		Sobremesa miSobre1 = new Sobremesa("1234POI", 4, "1234ASD", 1124.55, "Torre grande color azul");
		Sobremesa miSobre2 = new Sobremesa("2345POI", 3, "2345ASD", 1645.25, "Torre grande color negro");
		
		System.out.println("Las características del primer ordenador portátil son: "+miPort1.toString());
		System.out.println("Las características del segundo ordenador portátil son: "+miPort2.toString());
		System.out.println("Las características del primer ordenador de sobremesa son: "+miSobre1.toString());
		System.out.println("Las características del primer ordenador de sobremesa son: "+miSobre2.toString());

	}

}
