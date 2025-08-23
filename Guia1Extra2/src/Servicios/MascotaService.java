package Servicios;

import Entidades.Mascota;

import java.util.ArrayList;
import java.util.Scanner;

public class MascotaService {
    ArrayList<Mascota> mascotas;

    public void crearMascota(Scanner sc) {
        DuennoService duennoService = new DuennoService();
        Mascota mascota = new Mascota();
        System.out.println("Ingrese el nombre de la mascota");
        mascota.setNombre(sc.nextLine());
        System.out.println("Ingrese la edad de la mascota");
        mascota.setEdad(sc.nextInt());
        System.out.println("Ingrese la especie de la mascota");
        mascota.setEspecie(sc.nextLine());
        System.out.println("Desea crear un nuevo dueño? y/n");
        char option = (sc.next().toLowerCase().charAt(0));
        if (option == 'y') {
            duennoService.crearDuenno(sc);
            mascota.setDuenno(duennoService.getDuennos().getLast());
        } else {
            duennoService.mostrarDuennos();
            System.out.println("Ingrese el id del dueño");
            mascota.setDuenno(duennoService.buscarPorId(sc.nextInt()));
        }
        mascotas.add(mascota);
    }
    public void mostrarMascotas(){
        for(Mascota mascota:mascotas)
            System.out.println(mascota.toString());
    }
    public ArrayList<Mascota> buscarPorNombre(String nombre){
        ArrayList <Mascota> tempMascotas=new ArrayList<>();
        for(Mascota mascota:mascotas){
            if(mascota.getNombre().toLowerCase().contains(nombre.toLowerCase())) {
                tempMascotas.add(mascota);
            }
        }
        if(tempMascotas.isEmpty())
            return null;
        else
            return tempMascotas;
    }
}
