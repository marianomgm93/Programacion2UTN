package Ejercicio4;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

public class Ej4 {
    static void main() {


        String archivo = "src\\Ejercicio4\\biblioteca.json";
        /*
        Libro l1 = new Libro("Cien años de soledad", "Gabriel García Márquez");
        Libro l2 = new Libro("Rayuela", "Julio Cortázar");
        Libro l3 = new Libro("El Principito", "Antoine de Saint-Exupéry");
        Libro l4 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes");
        Libro l5 = new Libro("1984", "George Orwell");
        ArrayList<Libro> libros = new ArrayList<>();
        libros.add(l1);
        libros.add(l2);
        libros.add(l3);
        libros.add(l4);
        libros.add(l5);
        Biblioteca biblioteca = new Biblioteca("Municipal", libros);
        System.out.println(biblioteca);
        JSONObject o = biblioteca.toJSON();
        updateObj(archivo, o);

        Libro l6 = new Libro("La sombra del viento", "Carlos Ruiz Zafón");
        Libro l7 = new Libro("Los detectives salvajes", "Roberto Bolaño");
        Libro l8 = new Libro("Ficciones", "Jorge Luis Borges");
        Libro l9 = new Libro("El túnel", "Ernesto Sabato");
        Libro l10 = new Libro("Pedro Páramo", "Juan Rulfo");
        agregarLibro(l6,archivo);
        agregarLibro(l7,archivo);
        agregarLibro(l8,archivo);
        agregarLibro(l9,archivo);
        agregarLibro(l10,archivo);
        cambiarNombreBiblioteca(archivo,"Juventud Moderna");*/
        JSONObject o = new JSONObject(downloadObj(archivo));
        Biblioteca biblioteca2 = new Biblioteca(o);
        System.out.println(biblioteca2);
    }

    public static void cambiarNombreBiblioteca(String archivo, String nuevoNombre) {
        JSONObject o = new JSONObject(downloadObj(archivo));
        o.put("nombreBiblioteca",nuevoNombre);
        updateObj(archivo,o);
    }

    public static void agregarLibro(Libro l, String archivo) {
        JSONObject o = new JSONObject(downloadObj(archivo));
        JSONArray jarr = o.getJSONArray("libros");
        jarr.put(l.toJSON());
        try {
            BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo));
            buffer.write(o.toString());
            buffer.flush();
            buffer.close();
        } catch (IOException e) {
            System.out.println("Error al ingresar datos al archivo");
        }
    }

    public static String downloadObj(String archivo) {
        String json = "";
        try {

            File f = new File(archivo);
            json = Files.readString(f.toPath());

        } catch (NullPointerException e) {
            System.out.println("No se encuentra el archivo");
        } catch (IOException e) {
            System.out.println("El archivo no se puede leer");
        }
        return json;
    }

    public static void updateObj(String archivo, JSONObject o) {
        try {
            BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo));
            buffer.write(o.toString());
            buffer.flush();
            buffer.close();
        } catch (IOException e) {
            System.out.println("El archivo no se creo correctamente");
        }
    }
}
/*
4. Crea una clase Biblioteca con atributos como nombreBiblioteca y una lista
 de libros e implementa métodos para agregar y eliminar libros.
 Guarda el estado actual de la biblioteca en un archivo biblioteca.json.
 Lee el archivo biblioteca.json, realiza cambios en la lista de libros (añade o
 elimina algunos) y guarda los cambios de nuevo en el archivo.
Objetivos:
Manipular datos en JSON para actualizar información existente.
Leer y escribir JSON con modificaciones.
 */