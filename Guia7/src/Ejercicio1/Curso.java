package Ejercicio1;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class Curso {
    private static int total;
    private int codigo;
    private String nombreCurso;
    ArrayList<Persona> inscriptos;

    public Curso() {
        this.codigo=total++;
    }
    public Curso(JSONObject object){

        this.codigo=object.getInt("codigo");
        this.nombreCurso=object.getString("nombreCurso");
        this.inscriptos=new ArrayList<>();
        JSONArray jInscriptos=object.getJSONArray("inscriptos");
        for (int i = 0; i < jInscriptos.length(); i++) {
            inscriptos.add(new Persona((JSONObject) jInscriptos.get(i)));
        }
        total++;
    }

    public Curso(String nombreCurso, ArrayList<Persona> inscriptos) {
        this.codigo = total++;
        this.nombreCurso = nombreCurso;
        this.inscriptos = inscriptos;
    }

    public static int getTotal() {
        return total;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public ArrayList<Persona> getInscriptos() {
        return inscriptos;
    }

    public void setInscriptos(ArrayList<Persona> inscriptos) {
        this.inscriptos = inscriptos;
    }

    public JSONObject toJSON() {
        JSONObject curso = new JSONObject();
        curso.put("codigo", this.codigo);
        curso.put("nombreCurso", this.nombreCurso);
        curso.put("inscriptos", this.inscriptos);
        return curso;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Curso{");
        sb.append("codigo=").append(codigo);
        sb.append(", nombreCurso='").append(nombreCurso).append('\'');
        sb.append(", inscriptos=").append(inscriptos);
        sb.append('}');
        return sb.toString();
    }
}
/*
 3. Crea una clase Curso con atributos como nombreCurso, código, y una lista
 de Personas inscritas en el curso. Implementa métodos para agregar y
 eliminar personas del curso.
 Luego crea un método que convierta un objeto Curso a JSON y guárdalo en
 un archivo curso.json.
 Implementa otro método que lea el archivo curso.json y convierta el JSON a
 un objeto Curso.
 Objetivos:
Trabajar con listas de objetos y su persistencia en JSON.
Leer y escribir JSON que contenga una estructura compleja
 */