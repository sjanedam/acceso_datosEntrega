package main.parking;

public class ParkingTest {
    public static void main(String[] args) {
        System.out.println("Inicio ParkingTest");
        try {
            Vehiculo coche1 = new Vehiculo("1234LZP");
            ParkingVehiculo parkingBaroja = new ParkingVehiculo("Tolosa 2 Madrid");
            parkingBaroja.aparcaCoche(coche1);
            // Espero 2 minutos
            Thread.sleep(120*1000);
            parkingBaroja.sacaCoche(coche1);
            double dFactura = parkingBaroja.getFactura(coche1);
            System.out.println(coche1.toString() + "; Factura="+dFactura);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
