package Servicios;
import Entidades.Duenno;
import java.util.Scanner;
import java.util.ArrayList;
public class DuennoService {
    ArrayList <Duenno> duennos=new ArrayList<>();
    public void crearDuenno(Scanner sc){

        Duenno duenno=new Duenno();
        System.out.println("Ingrese Nombre del dueño: ");
        sc.nextLine();
        duenno.setNombre(sc.nextLine());
        sc.nextLine();
        System.out.println("Ingrese telefono del dueño: ");
        duenno.setTelefono(sc.nextLine());
        duennos.add(duenno);
    }
    public Duenno buscarPorId(int id){
        for(Duenno duenno:duennos){
            if(duenno.getId()==id)
                return duenno;
        }
        return null;
    }
    public void mostrarDuennos(){
        for(Duenno duenno: duennos)
            System.out.println(duenno.toString());
    }

    public ArrayList<Duenno> buscarPorNombre(String nombreDuenno){
        ArrayList<Duenno> tempDuennos= new ArrayList<>();

        for(Duenno duenno:duennos){
            if(duenno.getNombre().equals(nombreDuenno))
                tempDuennos.add(duenno);
        }
        if(tempDuennos.isEmpty())
            return null;
        else
            return tempDuennos;
    }

    public ArrayList<Duenno> getDuennos() {
        return duennos;
    }
}
