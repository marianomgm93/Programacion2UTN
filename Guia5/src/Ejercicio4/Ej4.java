package Ejercicio4;

public class Ej4 {
    public static void main(String[] args) {
        Colegio cole=new Colegio();
        try {
            cole.agregarAlumno(new Alumno("Juan","Argentino"));
        } catch (AlumnoExistenteEx e) {
            System.out.println(e.getMessage());
        }
        try {
            cole.agregarAlumno(new Alumno());
        }catch(AlumnoSinNacionalidadEx | AlumnoExistenteEx e ){
            System.out.println(e.getMessage());
        }
        try{
            System.out.println(cole.verNacionalidad("argentino"));

        }catch(ArregloVacio e){
           System.out.println(e.getMessage());
        }

        try{
            System.out.println(cole.cuantos());
        }catch(ArregloVacio e){
            System.out.println(e.getMessage());
        }
        try{
            cole.borrar(new Alumno("Quimey","Argentino"));
        }catch(AlumnoInexistenteEx e ){
            System.out.println(e.getMessage());
        }
        try{
            System.out.println(cole.verTodos());
        }catch(ArregloVacio e){
            System.out.println(e.getMessage());
        }
        System.out.println("Borrando alumnos.......");
        cole.getAlumnos().clear();

        try{
            cole.verTodos();
        }catch(ArregloVacio e){
            System.out.println(e.getMessage());
        }
    }

}
