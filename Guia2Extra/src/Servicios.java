import java.util.ArrayList;

public class Servicios {
    public ArrayList<Pelicula> mostrarPeliculas(ArrayList<Contenido> contenidos){
        ArrayList<Pelicula> pelis=new ArrayList<>();
        for(Contenido c:contenidos){
            if(c instanceof Pelicula)
                pelis.add((Pelicula) c);
        }
        return pelis;
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
