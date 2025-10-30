import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class JSONUtiles {
    public static void uploadJSON(String archivo, JSONObject o) {
        try {
            BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo));
            buffer.write(o.toString());
            buffer.flush();
            buffer.close();
        } catch (IOException e) {
            System.out.println("No se puede escribir en el archivo");
        }
    }

    public static String downloadJSON(String archivo) {
        String json = "";
        try {
            File file = new File(archivo);
            json = Files.readString(file.toPath());
        } catch (NullPointerException e) {
            System.out.println("No se encontro el archivo");
        } catch (IOException e) {
            System.out.println("Problemas al descargar el archivo");
        }
        return json;
    }
}
