package Ejercicio1;

import org.json.JSONObject;

public class Ej1 {
    public static void main(String[] args) {
        String archivo="personas";
       /*
        Persona p1=new Persona("Juan", 29,12312312,"M");
        JSONUtiles.upObjeto(archivo,p1.toJSON());
        */
        JSONObject jp=new JSONObject(JSONUtiles.traerArchivo(archivo));

        Persona p2=new Persona(jp.getString("nombre"),jp.getInt("edad"),jp.getInt("dni"),jp.getString("sexo"));
        System.out.println(p2);
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
 */