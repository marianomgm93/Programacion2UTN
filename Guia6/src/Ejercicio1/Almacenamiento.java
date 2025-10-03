package Ejercicio1;

import java.util.ArrayList;

/**
 *1. Crear una clase genérica llamada "Almacenamiento" que pueda almacenar
 * cualquier tipo de objeto. Debe tener métodos para agregar, eliminar, y buscar
 * objetos en el almacenamiento. Haz pruebas de tu clase con diferentes tipos
 * de objetos.
 */
public class Almacenamiento <T>{
    private ArrayList <T> almacen;

    public Almacenamiento() {
        this.almacen=new ArrayList<>();
    }

    public void almacenar(T objeto){
        almacen.add(objeto);
    }
    public void eliminar(T objeto){
        almacen.remove(objeto);

    }
    public T buscar(int id){
        return almacen.get(id);
    }
    public String mostrarAlmacen(){
        StringBuilder sb=new StringBuilder();
        sb.append("Almacen:\n");
        for(T t: almacen)
            sb.append(t).append("\n");
        sb.append("Fin Almacen");
        return sb.toString();
    }

}
