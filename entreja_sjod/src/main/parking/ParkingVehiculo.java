package main.parking;

import java.util.Date;

public class ParkingVehiculo implements Parking {
    public static final double dPrecio = 0.0425;
    public static final int iMax_plazas = 100;

    // Atributos
    protected String sDireccion;
    protected int iPlazas_ocupadas;

    // Constructor
    public ParkingVehiculo(String sDireccion) {
        this.sDireccion = sDireccion;
    }
 
    // M�todos
    @Override
    public boolean hayPlaza() {
        if (iMax_plazas > iPlazas_ocupadas) {
            return true;
        } else {
        return false;
        }
    }

    @Override
    public void aparcaCoche(Vehiculo paramVehiculo) {
        Date fecha = new Date();
        paramVehiculo.setdFecha_ini(fecha);;
    }

    @Override
    public void sacaCoche(Vehiculo paramVehiculo) {
        Date fecha = new Date();
        paramVehiculo.setdFecha_fin(fecha);
    }

    @Override
    public Double getFactura(Vehiculo paramVehiculo) {
        Date horaIni= paramVehiculo.getdFecha_ini();
        Date horaFin = paramVehiculo.getdFecha_fin();
        long horaEntrada = horaIni.getTime();
        long horaSalida = horaFin.getTime();

        // Diferencia en mili segundos
        long diferenciaHoras = (horaSalida - horaEntrada);
        
        // Diferencia en horas
        diferenciaHoras = diferenciaHoras / (1000*60*60);
        System.out.println("Diferencia en horas: "+diferenciaHoras);

        double dFactura = diferenciaHoras * dPrecio;

        return dFactura;
    }
	

}
