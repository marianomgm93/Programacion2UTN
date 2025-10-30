import org.json.JSONObject;

import java.util.Objects;

public class Vehiculo extends Disponible{
    private String patente;
    private String marca;
    private String modelo;
    private int capacidad;
    private int anio;

    public Vehiculo(){
    }

    public Vehiculo(String patente, String marca, String modelo, int capacidad, int anio) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.anio = anio;
    }
    public Vehiculo(JSONObject o){
        this.patente=o.getString("patente");
        this.marca=o.getString("marca");
        this.modelo=o.getString("modelo");
        this.capacidad=o.getInt("capacidad");
        this.anio=o.getInt("anio");
    }
    /*
    "vehiculos": [
        {
            "patente": "AA123BB",
            "marca": "Mercedes-Benz",
            "modelo": "Tourismo",
            "capacidad": 50,
            "anio": 2020
        },
 */

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(patente, vehiculo.patente);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(patente);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vehiculo{");
        sb.append("patente='").append(patente).append('\'');
        sb.append(", marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", capacidad=").append(capacidad);
        sb.append(", anio=").append(anio);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public JSONObject toJSON() {
        return null;
    }
}
