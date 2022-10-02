package main.parking;

interface Parking {
    // Metodos
    boolean hayPlaza();
    void aparcaCoche(Vehiculo paramVehiculo);
    void sacaCoche(Vehiculo paramVehiculo);
    Double getFactura(Vehiculo paramVehiculo);
}
 