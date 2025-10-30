package Ejercicio4;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

/*
 Crea una clase Biblioteca con atributos como nombreBiblioteca y una lista
 de libros e implementa métodos para agregar y eliminar libros.
 */
public class Biblioteca {
    private String nombreBiblioteca;
    private ArrayList<Libro> libros;

    public Biblioteca(String nombreBiblioteca, ArrayList<Libro> libros) {
        this.nombreBiblioteca = nombreBiblioteca;
        this.libros = libros;
    }
    public Biblioteca(JSONObject jb){
        this.nombreBiblioteca=jb.getString("nombreBiblioteca");
        this.libros=new ArrayList<>();
        JSONArray jarr=jb.getJSONArray("libros");
        for (int i = 0; i < jarr.length(); i++) {
            this.libros.add(new Libro((JSONObject) jarr.get(i)));
        }
    }
    public JSONObject toJSON(){
        JSONObject o=new JSONObject();
        o.put("nombreBiblioteca",this.nombreBiblioteca);
        JSONArray jlibros=new JSONArray();
        for(Libro l:this.libros)
            jlibros.put(l.toJSON());
        o.put("libros", jlibros);
        return o;
    }
    public void nuevoLibro(Libro l){
        this.libros.add(l);
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Biblioteca{");
        sb.append("nombreBiblioteca='").append(nombreBiblioteca).append('\'');
        sb.append(", libros=").append(libros);
        sb.append('}');
        return sb.toString();
    }
}
