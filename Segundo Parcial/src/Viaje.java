import org.json.JSONArray;
import org.json.JSONObject;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Viaje {
    private static int total;
    private int id;
    private String patenteVehiculo;
    private String choferDni;
    private LocalDateTime fechaSalida;
    private int duracion;
    private String lugarSalida;
    private String lugarDestino;
    private ArrayList<Pasajero> pasajeros;
    private Estado estado;

    public JSONObject toJSON(){
        JSONObject o =new JSONObject();
        o.put("id",this.id);
        o.put("choferDni",this.choferDni);
        o.put("fechaSalida",this.fechaSalida.toString());
        o.put("duracion",this.duracion);
        o.put("lugarSalida",this.lugarSalida);
        o.put("lugarDestino",this.lugarDestino);
        JSONArray jarrPasajeros=new JSONArray();
        for(Pasajero p:this.pasajeros){
            jarrPasajeros.put(p.toJSON());
        }
        o.put("pasajeros",jarrPasajeros);
        o.put("estado",estado.toString());
        return o;
    }
    public Viaje(String patenteVehiculo, String choferDni, LocalDateTime fechaSalida, int duracion, String lugarSalida, String lugarDestino, ArrayList<Pasajero> pasajeros, Estado estado) {
        this.patenteVehiculo = patenteVehiculo;
        this.choferDni = choferDni;
        this.fechaSalida = fechaSalida;
        this.duracion = duracion;
        this.lugarSalida = lugarSalida;
        this.lugarDestino = lugarDestino;
        this.pasajeros = pasajeros;
        this.estado = estado;
        this.id=total++;
    }
    public void enCurso() throws accionImpocibleEx{
        if(this.estado.equals(Estado.PENDIENTE)){
            this.estado=Estado.EN_CURSO;
        }else{
            throw new accionImpocibleEx("El viaje no se encuentra pendiente");
        }
    }
    public boolean verificarPasajero(Pasajero pasajero) throws accionImpocibleEx{
        boolean ocupado=false;
        if(this.pasajeros.contains(pasajero)) throw new accionImpocibleEx("El Pasajero con el dni "+pasajero.getDni()+" ya se encuentra en el viaje o el asiento numero "+pasajero.getAsiento()+" ya se encuentra ocupado");
        else {
            ocupado=true;
        }
        return ocupado;
    }
    public void finalizado() throws accionImpocibleEx{
        if(this.estado.equals(Estado.EN_CURSO)){
            this.estado=Estado.FINALIZADO;
        }else{
            throw new accionImpocibleEx("El viaje no se encuentra en curso");
        }
    }
    public static int getTotal() {
        return total;
    }

    public int getId() {
        return id;
    }

    public String getPatenteVehiculo() {
        return patenteVehiculo;
    }

    public void setPatenteVehiculo(String patenteVehiculo) {
        this.patenteVehiculo = patenteVehiculo;
    }

    public String getChoferDni() {
        return choferDni;
    }

    public void setChoferDni(String choferDni) {
        this.choferDni = choferDni;
    }

    public LocalDateTime getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getLugarSalida() {
        return lugarSalida;
    }

    public void setLugarSalida(String lugarSalida) {
        this.lugarSalida = lugarSalida;
    }

    public String getLugarDestino() {
        return lugarDestino;
    }

    public void setLugarDestino(String lugarDestino) {
        this.lugarDestino = lugarDestino;
    }

    public ArrayList<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(ArrayList<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Viaje{");
        sb.append("id=").append(id);
        sb.append(", patenteVehiculo='").append(patenteVehiculo).append('\'');
        sb.append(", choferDni='").append(choferDni).append('\'');
        sb.append(", fechaSalida=").append(fechaSalida);
        sb.append(", duracion=").append(duracion);
        sb.append(", lugarSalida='").append(lugarSalida).append('\'');
        sb.append(", lugarDestino='").append(lugarDestino).append('\'');
        sb.append(", pasajeros=").append(pasajeros);
        sb.append(", estado=").append(estado);
        sb.append('}');
        return sb.toString();
    }
}

/*
Los viajes tendrán la siguiente información:id único, patente del vehículo, dni del chofer,
fecha de salida, duración, lugar de salida, destino, lista de pasajeros y estado (PENDIENTE, EN CURSO, FINALIZADO).


 */