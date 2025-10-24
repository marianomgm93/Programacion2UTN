import Ejercicio1.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONWriter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String archivo= "JSONej.txt";

        String contenidoDelArchivo = JSONUtilidades.downloadJSON(archivo);
        ArrayList<Corredor> corredores = new ArrayList<>();

        try{
            JSONObject objArchivo = new JSONObject(contenidoDelArchivo);
            JSONArray arrJSONCorredores = objArchivo.getJSONArray("corredores");

            for(int i = 0; i<arrJSONCorredores.length(); i++){


                JSONObject corredorJSON = arrJSONCorredores.getJSONObject(i);
                JSONObject pilotoJSON = corredorJSON.getJSONObject("piloto");
                String nombrePiloto = pilotoJSON.getString("nombre");
                JSONObject escuderiaJSON = corredorJSON.getJSONObject("escuderia");
                Piloto piloto=new Piloto(nombrePiloto,pilotoJSON.getString("nacionalidad"),pilotoJSON.getInt("edad"),pilotoJSON.getInt("numero"),pilotoJSON.getInt("campeonatos_ganados"), pilotoJSON.getInt("victorias"),pilotoJSON.getInt("podios"), pilotoJSON.getInt("debut"),pilotoJSON.getString("fecha_nacimiento"));
                System.out.println(piloto);
                JSONArray patrocinadoresJSON= escuderiaJSON.getJSONArray("patrocinadores");
                ArrayList<String> patrocinadores= new ArrayList<>();
                for(int j = 0; j<patrocinadoresJSON.length(); j++){
                    patrocinadores.add(patrocinadoresJSON.getString(j));
                }
                Escuderia escuderia=new Escuderia(escuderiaJSON.getString("nombre"), escuderiaJSON.getString("pais"), escuderiaJSON.getString("jefe_equipo"), escuderiaJSON.getInt("fundacion"), escuderiaJSON.getInt("campeonatos_constructores"), patrocinadores);
                System.out.println(escuderia);
                JSONObject vehiculoJSON=corredorJSON.getJSONObject("vehiculo");

                Vehiculo vehiculo=new Vehiculo(vehiculoJSON.getString("modelo"),vehiculoJSON.getString("motor"),vehiculoJSON.getInt("potencia_hp"),vehiculoJSON.getInt("peso_kg"), vehiculoJSON.getString("combustible"),vehiculoJSON.getString("neumaticos"), vehiculoJSON.getString("transmision"));
                System.out.println(vehiculo);
                JSONObject temporadaJSON= corredorJSON.getJSONObject("temporada");
                Temporada temporada = new Temporada(temporadaJSON.getInt("anio"),temporadaJSON.getInt("puntos"), temporadaJSON.getInt("posicion_campeonato"), temporadaJSON.getInt("carreras_disputadas"),temporadaJSON.getInt("victorias"),temporadaJSON.getInt("podios"));
                System.out.println(temporada);
                Corredor corredor = new Corredor(piloto,escuderia,vehiculo,temporada);

                corredores.add(corredor);

            }

        }catch(JSONException e){
            System.out.println("el contenido del archivo no formato de un objeto de json");
        }

        for (Corredor c:corredores) {
            System.out.println(c);
        }




    }

}