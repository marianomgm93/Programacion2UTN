package Ejercicio1;

import org.json.JSONObject;

import java.util.ArrayList;

public class Ej1 {
    public static void main(String[] args) {
        String archivo="personas";
        ArrayList<Persona> personas=new ArrayList<>();
        Persona p1=new Persona("Juan", 29,12312312,"M");
        Persona p2 = new Persona("Lucía", 34, 45645645, "F");
        Persona p3 = new Persona("Carlos", 22, 78978978, "M");
        Persona p4 = new Persona("María", 27, 32132132, "F");
        Persona p5 = new Persona("Sofía", 31, 65465465, "F");
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);
        personas.add(p5);
        Curso curso=new Curso("Matematicas",personas);
        JSONObject object=curso.toJSON();
        JSONUtiles.upObjeto(archivo,object);

        JSONObject jp=new JSONObject(JSONUtiles.traerArchivo(archivo));
        Curso curso1=new Curso(jp);
        System.out.println(curso1);


    }
}
/*
.
 1_Crea una clase Persona con los siguientes atributos: nombre, edad, dni, y
 sexo. Implementa un constructor, getters y setters para los atributos.
 Ahora, implementa un método que convierta un objeto Persona a una
 representación JSON y luego guarda la representación JSON en un archivo
 llamado persona.json. Elige y utiliza una biblioteca de tu elección para la
 serialización de objetos a JSON y la escritura en archivos.
 Objetivos:
Convertir un objeto Java a JSON.
Escribir datos JSON en un archivo
 2. Utiliza la clase Persona del ejercicio anterior. Lee el archivo persona.json que
 creaste y convierte el JSON leído de nuevo a un objeto Persona.
 Objetivos:
Leer datos JSON desde un archivo.
Convertir JSON a un objeto Java


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