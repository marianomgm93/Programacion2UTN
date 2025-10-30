package Ejercicio1;

import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

/*
Crea una clase Persona con los siguientes atributos: nombre, edad, dni, y
 sexo.
 */
public class Persona {
    private String nombre;
    private int edad;
    private int dni;
    private String sexo;

    public Persona(String nombre, int edad, int dni, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
    }
    public Persona(JSONObject o) {
        this.nombre = o.getString("nombre");
        this.edad = o.getInt("edad");
        this.dni = o.getInt("dni");
        this.sexo = o.getString("sexo");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return edad == persona.edad && dni == persona.dni && Objects.equals(nombre, persona.nombre) && Objects.equals(sexo, persona.sexo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, dni, sexo);
    }
    public JSONObject toJSON(){
        JSONObject p=new JSONObject();
        p.put("nombre", this.nombre);
        p.put("dni",this.dni);
        p.put("edad",this.edad);
        p.put("sexo",this.sexo);
        return p;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", edad=").append(edad);
        sb.append(", dni=").append(dni);
        sb.append(", sexo='").append(sexo).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
