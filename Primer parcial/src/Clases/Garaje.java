package Clases;

import Enums.Tamanno;
import Enums.TipoAuto;
import Enums.TipoCamioneta;
import Enums.TipoMovimiento;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * El sistema debe permitir:
 * agregar una posición(prevenir vehículos duplicados)
 * ver una posición(en base a número)
 * cambiar propietario de una posición(en base a número)
 * cambiar vehículo de una posición (prevenir vehículos duplicados) (en base a número)
 * Agregar un autorizado a una posición (en base a número)
 * Limpiar los autorizados de una posición(en base a número)
 * marcar un movimiento (chequear que el movimiento lo realice alguien autorizado)
 * ver movimientos de una posición.
 */
public class Garaje {
    private ArrayList<Posicion> lugares;
    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<Movimiento> movimientos;
    private ArrayList<Propietario> propietarios;

    public Garaje() {
        this.lugares = new ArrayList<>();
        this.movimientos = new ArrayList<>();
        this.vehiculos = new ArrayList<>();
        this.propietarios = new ArrayList<>();
    }

    public void nuevaPosicion(int vehiculoID, ArrayList<Integer> permitidos, int propietarioID,Tamanno tamanno) {
        boolean ocupado = false;
        Vehiculo vehiculo=buscarVehiculo(vehiculoID);
        Propietario propietario=buscarPropietario(propietarioID);
        boolean repetido=vehiculoRepetido(vehiculoID);
        if(vehiculo!=null && propietario!=null && !repetido && validarTamanno(tamanno,vehiculo)) {
            for (Posicion p : lugares) {
                if (p.getVehiculo().equals(vehiculo)) {
                    System.out.println("Error, vehiculo ya estacionado");
                    ocupado = true;
                }
            }

            if (!ocupado)
                lugares.add(new Posicion(vehiculo, permitidos, propietario, tamanno));
            System.out.println("La posicion se agrego con exito");
        }

    }
    private boolean validarTamanno(Tamanno t,Vehiculo v){
        if(t==Tamanno.REGULAR && (v instanceof Camioneta))
            return false;
        return true;
    }
    public void nuevoPropietario(String nombre, int dni, int telefono) {
        propietarios.add(new Propietario(nombre, dni, telefono));
    }

    public void nuevoAuto(String marca, int modelo, String patente, TipoAuto tipo) {
        vehiculos.add(new Auto(marca,modelo,patente,tipo));
    }
    public void nuevaMoto(String marca, int modelo, String patente, boolean encendidoElectrico) {
        vehiculos.add(new Moto(marca,modelo,patente,encendidoElectrico));
    }
    public void nuevaCamioneta(String marca, int modelo, String patente, TipoCamioneta tipo) {
        vehiculos.add(new Camioneta(marca,modelo,patente,tipo));
    }
    public void nuevoMovimiento(int posicionID, TipoMovimiento tipo, int dni){
        Posicion pos=buscarPosicion(posicionID);
        if(pos.getPermitidos().contains(dni)) {
            if((tipo==TipoMovimiento.SALIDA && !pos.isEnPosicion()) || (tipo==TipoMovimiento.ENTRADA && !pos.isEnPosicion()))
                System.out.println("ERROR");
            else {
                movimientos.add(new Movimiento(posicionID, LocalDateTime.now(), tipo));
                pos.setEnPosicion(!pos.isEnPosicion());
            }
        }
    }
    public Vehiculo buscarVehiculo(int id){
        for(Vehiculo v:vehiculos){
            if(v.getId()==id)
                return v;
        }
        return null;
    }
    public Propietario buscarPropietario(int id){
        for(Propietario p:propietarios){
            if(p.getId()==id)
                return p;
        }
        return null;
    }
    public Posicion buscarPosicion(int id){
        for(Posicion p:lugares){
            if(p.getId()==id)
                return p;
        }
        return null;
    }
    public String mostrarPosiciones(){
        StringBuilder posiciones= new StringBuilder();
        for(Posicion p: lugares)
            posiciones.append(p.toString());
        return posiciones.toString();
    }
    public String mostrarPosicion(int id){
        return buscarPosicion(id).toString();
    }
    /**
     * Retorna verdadero si el vehiculo ya se encuentra en una posicion
     */
    public boolean vehiculoRepetido(int vehiculoID){
        for(Posicion p:lugares){
            if(p.getVehiculo().getId()==vehiculoID)
                return true;
        }
        return false;
    }

    /**
     * con excepcion de posicion
     * @param vehiculoID
     * @param posicionID
     * @return
     */
    public boolean vehiculoRepetido(int vehiculoID,int posicionID){
        for(Posicion p:lugares){
            if(p.getId()!=posicionID) {
                if (p.getVehiculo().getId() == vehiculoID)
                    return true;
            }
        }
        return false;
    }
    public void cambiarPropietario(int posicionID,int propietarioID){
        Posicion posicion=buscarPosicion(posicionID);
        Propietario propietario=buscarPropietario(propietarioID);
        if(posicion!=null && propietario!=null) {
            posicion.setPropietario(propietario);
            System.out.println("El propietario se cambio correctamente");
        }
    }
    public void cambiarVehiculo(int posicionID,int vehiculoID){
        Posicion posicion=buscarPosicion(posicionID);
        Vehiculo vehiculo=buscarVehiculo(vehiculoID);

        if(posicion!=null && vehiculo!=null && validarTamanno(posicion.getTamanno(),vehiculo) && !vehiculoRepetido(vehiculoID,posicionID)) {
            posicion.setVehiculo(null);
            posicion.setVehiculo(vehiculo);
            System.out.println("Vehiculo se cambio correctamente");
        }
    }
    public void agregarAutorizado(int dni,int posicionID){
        Posicion posicion=buscarPosicion(posicionID);
        ArrayList<Integer> nuevosPermitidos=posicion.getPermitidos();
        nuevosPermitidos.add(dni);
        posicion.setPermitidos(nuevosPermitidos);
    }
    public void limpiarAutorizados(int posicionID){
        buscarPosicion(posicionID).getPermitidos().clear();
    }
    public String mostrarMovimientos(){
        StringBuilder movs=new StringBuilder();
        for(Movimiento m:movimientos)
            movs.append(m.toString());
        return movs.toString();
    }

}
