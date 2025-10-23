package Ejercicio1;

import org.json.JSONArray;
import org.json.JSONTokener;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Ej1 {
    public static void main(String[] args) {
        String archivo= "JSONej1.txt";
        JSONArray corredoresJSON= new JSONArray();

        System.out.println(downloadJSON(archivo));
    }
        public static String downloadJSON(String archivo){
        String rta="";
            File arch=new File(archivo);
            System.out.println(arch.exists());
            try{
                rta= Files.readString(arch.toPath());
            } catch (IOException e) {
                System.out.println("Error al abrir");
            }
            return rta;
        }
}
