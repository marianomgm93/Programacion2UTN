import model.Contenido;
import model.Pelicula;
import model.Serie;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public void inicio(ArrayList<Contenido> arr, Scanner sc) {
        int option;
        boolean continuar = true;
        Servicio servicios = new Servicio();
        do {
            System.out.println("MENU PRINCIPAL");
            System.out.println("0\tSalir\n" +
                    "1\tVer Peliculas\n" +
                    "2\tVer Series\n" +
                    "3\tBuscar por nombre\n");
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 0:
                    continuar = false;
                    break;
                case 1:
                    Utilidades.clearConsole();
                    for (Pelicula p : servicios.mostrarPeliculas(arr))
                        System.out.println(p);
                    break;
                case 2:
                    Utilidades.clearConsole();
                    for (Serie s : servicios.mostrarSeries(arr))
                        System.out.println(s);
                    break;
                case 3:
                    Utilidades.clearConsole();
                    for (Contenido c : menuBuscarPorNombre(arr, sc))
                        System.out.println(c);
                    break;
                default:
                    System.out.println("El codigo ingresado es invalido, intentelo nuevamente");
                    break;
            }
        } while (continuar);
    }

    public ArrayList<Contenido> menuBuscarPorNombre(ArrayList<Contenido> contenido, Scanner sc) {
        String nombre;
        Servicio servicio = new Servicio();
        int option;
        System.out.println("Ingrese el nombre de la pelicula o serie:");
        nombre = sc.nextLine();
        return servicio.buscarPorNombre(contenido, nombre);

    }
}
