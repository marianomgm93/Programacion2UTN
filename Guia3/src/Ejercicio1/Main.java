package Ejercicio1;

import Ejercicio1.model.Autobus;
import Ejercicio1.model.Bicicleta;
import Ejercicio1.model.Tranvia;
import Ejercicio1.model.Vehiculo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 1. Implementar un sistema básico para la gestión de diferentes tipos de
 * transporte urbano. Utilizar interfaces para definir comportamientos comunes y
 * enumeradores para representar diferentes tipos de transporte.
 * Consignas:
 * a. Enumerador TipoTransporte:
 * - Define los tipos de transporte: AUTOBUS, TRANVIA, TREN, BICICLETA.
 * b. Interfaz Transporte:
 * - Define los métodos arrancar(), detener(), y obtenerCapacidad().
 * c. Clase Autobus:
 * - Implementa la interfaz Transporte.
 * - Atributos: numeroLinea (entero), capacidad (entero), tipo
 * (TipoTransporte).
 * - Métodos: Implementa los métodos definidos en la interfaz y un método
 * adicional para anunciar la próxima parada (anunciarParada(String
 * parada)).
 * d. Clase Tranvía:
 * - Implementa la interfaz Transporte.
 * - Atributos: ruta (cadena de texto), capacidad (entero), tipo
 * (TipoTransporte).
 * - Métodos: Implementa los métodos definidos en la interfaz y un método
 * adicional para cambiar de vía (cambiarVia(int nuevaVia)).
 * e. Clase Bicicleta:
 * - Implementa la interfaz Transporte.
 * - Atributos: numeroSerie (cadena de texto), tipo (TipoTransporte).
 * - Métodos: Implementa los métodos definidos en la interfaz y un método
 * adicional para ajustar la altura del asiento (ajustarAsiento(int altura)).
 * - obtenerCapacidad() devuelve 1 (porque solo tiene capacidad para una
 * persona).
 * En la clase Ejercicio2.Main:
 * 1. Crea instancias de cada clase (Autobus, Tranvía, Bicicleta).
 * 2. Simula el arranque, la detención y la obtención de la capacidad de cada
 * transporte.
 * 3. Muestra el tipo de transporte y el estado de cada uno en la consola.
 */
public class Main {
    public static void main(String[] args){
        ArrayList <Vehiculo> vehiculos= new ArrayList<>();
        vehiculos.add(new Bicicleta("1256"));
        vehiculos.add(new Bicicleta("126"));
        vehiculos.add(new Bicicleta("134"));
        vehiculos.add(new Autobus(30,525));
        vehiculos.add(new Autobus(30,563));
        vehiculos.add(new Autobus(30,543));
        vehiculos.add(new Tranvia(90,"221"));
        vehiculos.add(new Tranvia(90,"222"));
        vehiculos.add(new Tranvia(90,"223"));
        vehiculos.add(new Tranvia(90,"224"));
        HashMap<Integer,Vehiculo> vehiculoHashMap=new HashMap<Integer, Vehiculo>();
        for(Vehiculo v:vehiculos){
            vehiculoHashMap.put(v.getId(),v);
        }
        Iterator<Map.Entry<Integer,Vehiculo>> it=vehiculoHashMap.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry<Integer,Vehiculo> entrada=it.next();
            System.out.println(entrada.getValue());
        }


    }
}