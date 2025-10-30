import java.util.ArrayList;

public class Recurso <T extends Disponible> {
    private ArrayList<T> recursos=new ArrayList<>();


    public void agregarRecurso(T recurso){
        this.recursos.add(recurso);
    }
    public void eliminarRecurso(int id){
        this.recursos.remove(id);
    }

    public ArrayList<T> getRecursos() {
        return recursos;
    }

    public void setRecursos(ArrayList<T> recursos) {
        this.recursos = recursos;
    }
}
