package Ejercicio5;

import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class Utilidades {
    public static String levantarJSON(String archivo){
        File file= new File(archivo);
        String json="";
        if(!file.exists()) throw new ArchivoInexistenteException("No fue posible abrir el archivo");
        else {
            try {
                json= Files.readString(file.toPath());
            } catch (IOException e) {
                System.out.println("Error al intentar leer el archivo");
            }
            return json;
        }
    }
    public static void uploadJSON(String archivo, JSONObject o){
        try {
            BufferedWriter buffer=new BufferedWriter(new FileWriter(archivo));
            buffer.write(o.toString());
            buffer.flush();
            buffer.close();
        } catch (IOException e) {
            System.out.println("Problemas al intentar escribir en el archivo");
        }
    }

}
