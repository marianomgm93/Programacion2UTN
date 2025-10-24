package Ejercicio1;
/* "piloto": {
        "nombre": "Max Verstappen",
        "nacionalidad": "Países Bajos",
        "edad": 27,
        "numero": 1,
        "campeonatos_ganados": 3,
        "victorias": 61,
        "podios": 96,
        "debut": 2015,
        "fecha_nacimiento": "1997-09-30"
      },*/
public class Piloto {
    private String nombre;
    private String nacionalidad;
    private int edad;
    private int numero;
    private int campeonatos_ganados;
    private int victorias;
    private int podios;
    private int debut;
    private String fecha_nacimiento;

    public Piloto(String nombre, String nacionalidad, int edad, int numero, int campeonatos_ganados, int victorias, int podios, int debut, String fecha_nacimiento) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.numero = numero;
        this.campeonatos_ganados = campeonatos_ganados;
        this.victorias = victorias;
        this.podios = podios;
        this.debut = debut;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Piloto{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", nacionalidad='").append(nacionalidad).append('\'');
        sb.append(", edad=").append(edad);
        sb.append(", numero=").append(numero);
        sb.append(", campeonatos_ganados=").append(campeonatos_ganados);
        sb.append(", victorias=").append(victorias);
        sb.append(", podios=").append(podios);
        sb.append(", debut=").append(debut);
        sb.append(", fecha_nacimiento='").append(fecha_nacimiento).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
