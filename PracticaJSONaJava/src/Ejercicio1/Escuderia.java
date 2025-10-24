package Ejercicio1;

import java.util.ArrayList;

/*"escuderia": {
        "nombre": "Red Bull Racing",
        "pais": "Austria",
        "jefe_equipo": "Christian Horner",
        "fundacion": 2005,
        "campeonatos_constructores": 6,
        "patrocinadores": [
          "Oracle",
          "Mobil 1",
          "Bybit"
        ]
      },*/
public class Escuderia {
    private String nombre;
    private String pais;
    private String jefe_equipo;
    private int fundacion;
    private int campeonatos_constructores;
    private ArrayList<String> patrocinadores;

    public Escuderia(String nombre, String pais, String jefe_equipo, int fundacion, int campeonatos_constructores, ArrayList<String> patrocinadores) {
        this.nombre = nombre;
        this.pais = pais;
        this.jefe_equipo = jefe_equipo;
        this.fundacion = fundacion;
        this.campeonatos_constructores = campeonatos_constructores;
        this.patrocinadores = patrocinadores;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Escuderia{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", pais='").append(pais).append('\'');
        sb.append(", jefe_equipo='").append(jefe_equipo).append('\'');
        sb.append(", fundacion=").append(fundacion);
        sb.append(", campeonatos_constructores=").append(campeonatos_constructores);
        sb.append(", patrocinadores=").append(patrocinadores);
        sb.append('}');
        return sb.toString();
    }
}
