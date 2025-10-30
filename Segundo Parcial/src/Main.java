import org.json.JSONObject;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       JSONObject material=new JSONObject(JSONUtiles.downloadJSON("flota_y_empleados.txt"));
       Empresa empresa=new Empresa(material);
       for(Empleado e:empresa.getEmpleados().getRecursos()){
           System.out.println(e);
       }
       for(Vehiculo v:empresa.getVehiculos().getRecursos()){
           System.out.println(v);
       }
       //Agregar un chofer al staff (no permitir dni duplicado, lanza elementoDuplicadoEx)(no es necesario actualizar el archivo
       //empresa.agregarChofer(empresa.getEmpleados().getRecursos().getFirst());

       empresa.agregarChofer(new Empleado("123123","mariano","marineEspacial",10));
        for(Empleado e:empresa.getEmpleados().getRecursos()){
            System.out.println(e);
        }
        //Agregar un nuevo viaje(debe validar que la patente y el dni existan en el sistema). (cuando se crea un su estado es pendiente)
        ArrayList<Pasajero> pasajeros=new ArrayList<>();
        empresa.nuevoViaje("AA123BB","30111222", LocalDateTime.now(),10,"Ezeiza","Barcelona",pasajeros);
        System.out.println(empresa.getViajes());
        //Agregar pasajero a viaje. (Debe validar que tanto el dni, como el asiento no esten ya cargados, si no lanza accionImpocibleEx)
        Pasajero p = new Pasajero("123159","Juan",22);
        Pasajero p1 = new Pasajero("12312","Quimey",22);
        Pasajero p2 = new Pasajero("123159","Emma",12);
        empresa.agregarPasajero(0,p);

        empresa.agregarPasajero(0,p1);

        empresa.agregarPasajero(0,p2);


        //Pasar estado de viaje a “en curso”. (debe validar que el estado sea pendiente para hacerlo, si no lanza accionImposibleEx).
        empresa.iniciarViaje(0);
        System.out.println(empresa.getViajes().get(0));
        empresa.iniciarViaje(0);
        //Pasar estado de viaje a “finalizado”. (debe validar que el estado sea en curso para hacerlo, si no lanza accionImposibleEx).
        empresa.finalizarViaje(0);
        System.out.println(empresa.getViajes().get(0));
        empresa.finalizarViaje(0);
        //guardar información de los viajes cargados en la ultima ejecución en un nuevo archivo con formato JSON llamado “viajes.txt”
        String archivoViajes="src\\viajes.txt";
        empresa.updateViajes(archivoViajes);
        System.out.println(JSONUtiles.downloadJSON(archivoViajes));

    }
}
/*
2do Parcial Programación 2 2025

Una compañía de viajes de larga distancia nos ha encargado un sistema para registrar sus viajes.

En el archivo adjunto encontrarán la información de su flota de vehículos y sus empleados. Deserializar la información para poder tener en el sistema dicha información.

Crear una clase genérica para guardar por un lado los vehículos y utilizarla también para guardar los empleados. Debe tener métodos para agregar, verInfo en base a un string, si existe en base a un string, etc….

Los viajes tendrán la siguiente información:id único, patente del vehículo, dni del chofer, fecha de salida, duración, lugar de salida, destino, lista de pasajeros y estado (PENDIENTE, EN CURSO, FINALIZADO).

De los pasajeros guardaremos dni, nombre y asiento asignado.

El sistema debe permitir:
Agregar un chofer al staff (no permitir dni duplicado, lanza elementoDuplicadoEx)(no es necesario actualizar el archivo)
Agregar un nuevo viaje(debe validar que la patente y el dni existan en el sistema). (cuando se crea un su estado es pendiente)
Agregar pasajero a viaje. (Debe validar que tanto el dni, como el asiento no esten ya cargados, si no lanza accionImpocibleEx)
Pasar estado de viaje a “en curso”. (debe validar que el estado sea pendiente para hacerlo, si no lanza accionImposibleEx).
Pasar estado de viaje a “finalizado”. (debe validar que el estado sea en curso para hacerlo, si no lanza accionImposibleEx).
guardar información de los viajes cargados en la ultima ejecución en un archivo con formato JSON.

*/