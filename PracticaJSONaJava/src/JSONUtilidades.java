import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

public class JSONUtilidades {

    public JSONUtilidades() {
    }
    /*
    public JSONTokener leer(String archivo){
        JSONTokener tokener=null;
        try{
            tokener=new JSONTokener(new FileReader(archivo));

        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo");
        }
        return tokener;
    }



    public <T> void  levantarArchivo(String archivo, ArrayList<T> objetos){
        JSONArray arr=new JSONArray(leer(archivo));


    }

     */

    public static String downloadJSON(String archivo) {
        String rta = "";
        File arch = new File(archivo);
        System.out.println(arch.exists());
        try {
            rta = Files.readString(arch.toPath());
        } catch (IOException e) {
            System.out.println("Error al abrir");
        }
        return rta;
    }
}
