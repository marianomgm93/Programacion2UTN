package Ejercicio1;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.nio.file.Files;

public class JSONUtiles {
    public static void upObjeto(String archivo, JSONObject jsonObject) {
        try {
            BufferedWriter buffer = new BufferedWriter(new FileWriter("src\\Ejercicio1\\" + archivo + ".json", true));
            buffer.write(jsonObject.toString());
            buffer.flush();
            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void upArreglo(String archivo, JSONArray jsonArr) throws IOException {
        BufferedWriter buffer = new BufferedWriter(new FileWriter("src\\Ejercicio1\\" + archivo + ".json", true));
        buffer.write(jsonArr.toString());
        buffer.flush();
        buffer.close();
    }

    public static String traerArchivo(String archivo) {
        String json = "";
        try {
            File file = new File("src\\Ejercicio1\\"+archivo+".json");
            json = Files.readString(file.toPath());
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json;

    }
}
