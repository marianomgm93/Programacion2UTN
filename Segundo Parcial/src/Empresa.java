import org.json.JSONArray;
import org.json.JSONObject;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Empresa{
    private Recurso<Vehiculo> vehiculos;
    private Recurso<Empleado> empleados;
    private ArrayList<Viaje> viajes=new ArrayList<>();

    public Empresa(Recurso<Vehiculo> vehiculos, Recurso<Empleado> empleados) {
        this.vehiculos = vehiculos;
        this.empleados = empleados;
    }
    public Empresa(JSONObject o){
        JSONArray jarrVehiculos=o.getJSONArray("vehiculos");
        this.vehiculos=new Recurso<>();
        for (int i = 0; i < jarrVehiculos.length(); i++) {
            this.vehiculos.agregarRecurso(new Vehiculo(jarrVehiculos.getJSONObject(i)));
        }
        JSONArray jarrEmpleados=o.getJSONArray("empleados");
        this.empleados=new Recurso<>();
        for (int i = 0; i < jarrEmpleados.length(); i++) {
            this.empleados.agregarRecurso(new Empleado(jarrEmpleados.getJSONObject(i)));
        }
    }
    public void agregarPasajero(int viajeId,Pasajero pasajero){
        try{
            this.viajes.get(viajeId).verificarPasajero(pasajero);
            this.viajes.get(viajeId).getPasajeros().add(pasajero);

        }catch (accionImpocibleEx e){
            System.out.println(e);
        }

    }
    public void iniciarViaje(int id){
        try{
            this.viajes.get(id).enCurso();
        }catch (accionImpocibleEx e){
            System.out.println(e);
        }
    }
    public void finalizarViaje(int id){
        try{
            this.viajes.get(id).finalizado();
        } catch (accionImpocibleEx e) {
            System.out.println(e);
        }
    }
    public ArrayList<Viaje> getViajes() {
        return viajes;
    }

    public void setViajes(ArrayList<Viaje> viajes) {
        this.viajes = viajes;
    }
    public void updateViajes(String archivo){
        JSONArray jarr=new JSONArray();
        for(Viaje v : this.viajes){
            jarr.put(v.toJSON());
        }
        JSONUtiles.uploadJSON(jarr,archivo);
    }
    public void agregarChofer(Empleado empleado) throws elementoDuplicadoEx{
        if(this.empleados.getRecursos().contains(empleado)) throw new elementoDuplicadoEx("El elemento ya esta en el arreglo");
        else this.empleados.agregarRecurso(empleado);
    }
    public boolean verificarVehiculos(String patenteVehiculo){
        boolean vehiculoPresente=false;
        for(Vehiculo v:this.vehiculos.getRecursos()){
            if(v.getPatente().equals(patenteVehiculo)) vehiculoPresente=true;
        }
        return vehiculoPresente;
    }
    public boolean verificarEmpleado(String dni){
        boolean empleadoPresente=false;
        for(Empleado e:this.empleados.getRecursos()){
            if(e.getDni().equals(dni)) empleadoPresente=true;
        }
        return empleadoPresente;
    }
    public void nuevoViaje(String patenteVehiculo, String choferDni, LocalDateTime fechaSalida, int duracion, String lugarSalida, String lugarDestino, ArrayList<Pasajero> pasajeros) throws RecursoNoDisponibleEx{
        if(verificarVehiculos(patenteVehiculo) && verificarEmpleado(choferDni)) {
            viajes.add(new Viaje(patenteVehiculo,choferDni,fechaSalida,duracion,lugarSalida,lugarDestino,pasajeros,Estado.PENDIENTE));
        }else{
            throw new RecursoNoDisponibleEx("El vehiculo o el empleado no se encuentran disponibles");
        }
    }
    public void setVehiculos(Recurso<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public void setEmpleados(Recurso<Empleado> empleados) {
        this.empleados = empleados;
    }

    public Recurso<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public Recurso<Empleado> getEmpleados() {
        return empleados;
    }
}
/*
El sistema debe permitir:
Agregar un chofer al staff (no permitir dni duplicado, lanza elementoDuplicadoEx)(no es necesario actualizar el archivo)
Agregar un nuevo viaje(debe validar que la patente y el dni existan en el sistema). (cuando se crea un su estado es pendiente)
Agregar pasajero a viaje. (Debe validar que tanto el dni, como el asiento no esten ya cargados, si no lanza accionImpocibleEx)
Pasar estado de viaje a “en curso”. (debe validar que el estado sea pendiente para hacerlo, si no lanza accionImposibleEx).
Pasar estado de viaje a “finalizado”. (debe validar que el estado sea en curso para hacerlo, si no lanza accionImposibleEx).
guardar información de los viajes cargados en la ultima ejecución en un archivo con formato JSON.

 */