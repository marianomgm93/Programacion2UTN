package Ejercicio4;

import java.util.ArrayList;

/**
 * 4. Crea una clase colegio que almacene el listado de los alumnos (compuestos
 * por su nombre y nacionalidad). La clase tendrá los siguientes
 * métodos:----
 * agregarAlumno(Alumno alumno): añade el alumno recibido por
 * parámetro al listado.
 * verNacionalidad(String nacionalidad): Muestra la nacionalidad y el
 * número de alumnos de esa nacionalidad
 * cuantos(): Muestra cuántas nacionalidades diferentes existen en el
 * colegio.
 * borrar(Alumno alumno): Elimina a un alumno específico del listado.
 * verTodos(): Muestra las distintas nacionalidades y el número de
 * alumnos que existen por nacionalidad.
 * Para todos estos métodos se deben generar distintas validaciones para
 * prevenir errores en la ejecución. Por ej: Que todos los alumnos tengan una
 * nacionalidad, que exista el alumno que se quiere borrar, etc
 */
public class Colegio {
    private ArrayList<Alumno> alumnos;

    public Colegio() {
        this.alumnos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno) throws AlumnoExistenteEx {
        if (alumnos.contains(alumno))
            throw new AlumnoExistenteEx("El alumno ya se encuentra en el arreglo");
        else if (alumno.getNacionalidad() == null)
            throw new AlumnoSinNacionalidadEx("El alumno que esta intentando cargar no tiene nacionalidad");
        else
            alumnos.add(alumno);
    }

    public String verNacionalidad(String nacionalidad) throws ArregloVacio {
        ArrayList<Alumno> nacionalizados = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int contador = 0;
        for (Alumno a : alumnos) {
            if (a.getNacionalidad().equalsIgnoreCase(nacionalidad)) {
                sb.append(a);
                contador++;
            }
        }
        sb.append("\nLa cantidad de alumnos provenientes de " + nacionalidad + " es: " + contador);
        if (nacionalizados.isEmpty())
            throw new ArregloVacio("No hay ningun alumno con esa nacionalidad");
        return sb.toString();
    }

    public int cuantos() {
        ArrayList<String> distintasNacionalidades = new ArrayList<>();
        for (Alumno a : alumnos) {
            if (!distintasNacionalidades.contains(a.getNacionalidad().toLowerCase()))
                distintasNacionalidades.add(a.getNacionalidad().toLowerCase());
        }
        if (distintasNacionalidades.isEmpty())
            throw new ArregloVacio("No hay ningun alumno");
        return distintasNacionalidades.size();
    }

    /**
     * Retorna true si se completo con exito;
     *
     * @param alumno
     * @return
     */
    public boolean borrar(Alumno alumno) {
        if (!alumnos.contains(alumno))
            throw new AlumnoInexistenteEx("No se encontró al alumno");
        else
            alumnos.remove(alumno);
        return true;

    }

    public String verTodos() {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> nacionalidades = new ArrayList<>();
        int contador;
        if (alumnos.isEmpty())
            throw new ArregloVacio("No hay alumnos en el arreglo");
        for (Alumno a : alumnos) {
            if (!nacionalidades.contains(a.getNacionalidad().toLowerCase())) {
                nacionalidades.add(a.getNacionalidad().toLowerCase());
                contador = 0;
                for (Alumno b : alumnos) {
                    if (b.getNacionalidad().equalsIgnoreCase(a.getNacionalidad()))
                        contador++;
                }
                sb.append(a.getNacionalidad()).append(": ").append(contador).append("\n");
            }

        }
        return sb.toString();
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }
}
