import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) {
        String archivo= "src\\JSONej1.txt";
        JSONUtilidades utils= new JSONUtilidades();
        System.out.println(utils.downloadJSON(archivo));
    }

}