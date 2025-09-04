import model.Contenido;
import model.Pelicula;
import model.Serie;

import java.util.ArrayList;

public class Servicio {
    public ArrayList<Pelicula> mostrarPeliculas(ArrayList<Contenido> contenidos) {
        ArrayList<Pelicula> pelis = new ArrayList<>();
        for (Contenido c : contenidos) {
            if (c instanceof Pelicula)
                pelis.add((Pelicula) c);
        }
        return pelis;
    }

    public ArrayList<Contenido> buscarPorNombre(ArrayList<Contenido> contenidos, String nombreBusqueda) {
        ArrayList<Contenido> filtroPorNombre = new ArrayList<>();

        for (Contenido c : contenidos)
            if (c.getTitulo().toLowerCase().contains(nombreBusqueda.toLowerCase()))
                filtroPorNombre.add(c);
        return filtroPorNombre;
    }

    public ArrayList<Serie> mostrarSeries(ArrayList<Contenido> contenidos) {
        ArrayList<Serie> series = new ArrayList<>();
        for (Contenido c : contenidos) {
            if (c instanceof Serie)
                series.add((Serie) c);
        }
        return series;
    }

}
