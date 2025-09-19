package model;

import java.util.ArrayList;

public class Empresa {

    public void nuevoViaje(ArrayList<Viaje> viajes,VehiculoDeCarga vehiculo,Chofer chofer,String destino, int distancia, double tarifa, double carga){
        viajes.add(new ViajeCarga(vehiculo.getPatente(), chofer.getDni(),destino,distancia,tarifa,carga));
    }
    public void nuevoViaje(ArrayList<Viaje> viajes,VehiculoDePasajeros vehiculo,Chofer chofer,String destino, int distancia, double tarifa, int cantidadPasajeros){
        viajes.add(new ViajePasajeros(vehiculo.getPatente(), chofer.getDni(),destino,distancia,tarifa,cantidadPasajeros));
    }
    public void nuevoViaje(ArrayList<Viaje> viajes,VehiculoEmpresarial vehiculo,Chofer chofer,String destino, int distancia, double tarifa, int cantidadPasajeros){
        viajes.add(new ViajePasajeros(vehiculo.getPatente(), chofer.getDni(),destino,distancia,tarifa,cantidadPasajeros));
    }

    public void nuevoVehiculo(TipoVehiculo tipo,ArrayList<Vehiculo> vehiculos, int modelo, Marca marca, String patente, int velocidadRecomendada, int kilometraje, double cargaOPasajeros){
        switch (tipo){
            case CARGA:
                vehiculos.add(new VehiculoDeCarga(modelo,marca,patente,velocidadRecomendada,kilometraje,cargaOPasajeros,Unidad.KGS));
                break;
            case PASAJEROS:
                vehiculos.add(new VehiculoDePasajeros(modelo,marca,patente,velocidadRecomendada,kilometraje,(int) cargaOPasajeros,Categoria.STANDARD));
                break;
            case EMPRESARIAL:
                break;
        }
    }




}
