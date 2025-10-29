import java.io.File;
import java.io.IOException;
import java.nio.file.Files;


public class JSONUtilidades {

    public JSONUtilidades() {
    }

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
