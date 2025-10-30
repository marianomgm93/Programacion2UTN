package Ejercicio5;

import org.json.JSONObject;

import java.util.ArrayList;

public class Ej5 {
    static void main() {
        String archivo="src\\Ejercicio5\\empresa.json";
        /*Empleado e1 = new Empleado("Ana", 50000, "Recursos Humanos");
        Empleado e2 = new Empleado("Luis", 60000, "Finanzas");
        Empleado e3 = new Empleado("María", 55000, "Marketing");
        ArrayList<Empleado> empleados=new ArrayList<>();
        empleados.add(e1);
        empleados.add(e2);
        empleados.add(e3);
        Empresa empresa=new Empresa("Globant",empleados);
        Utilidades.uploadJSON(archivo,empresa.toJSON());
        */

        JSONObject jempresa=new JSONObject(Utilidades.levantarJSON(archivo));
        Empresa empresa=new Empresa(jempresa);
        System.out.println(empresa);
        empresa.eliminarEmpleado(0);
        Utilidades.uploadJSON(archivo,empresa.toJSON());
    }
}
/* 5. Crea una clase Empleado con los atributos id, nombre, salario, y
 departamento.
 Implementa métodos para convertir un objeto Empleado a JSON y viceversa.
 Agrega validaciones para asegurarte de que el JSON que se lee tiene el
 formato correcto y contiene todos los campos necesarios.
 Maneja los posibles errores que puedan ocurrir durante la lectura y escritura
 de archivos JSON, como archivos no encontrados o datos mal formateados.
 Objetivos:
Implementar validación de datos JSON.
Manejar errores y excepciones durante el procesamiento de
 archivos JSON

 */