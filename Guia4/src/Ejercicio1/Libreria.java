import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Libreria {
    private HashMap<Integer, Libro> libros;

    public Libreria() {
        libros = new HashMap<>();
    }

    public void agregarLibro(Integer id, Libro libro) {
        libros.put(id, libro);
    }

    public Libro obtenerLibro(Integer id) {
        return libros.get(id);
    }

    public boolean eliminarLibro(Integer id) {
        return libros.remove(id) != null;
    }

    public HashMap<Integer, Libro> getLibros() {
        return libros;
    }

    public String mostrarLibros() {
        StringBuilder sb = new StringBuilder();
        for (Libro libro : libros.values()) {
            sb.append(libro.toString()).append("\n");
        }
        return sb.toString();
    }

    public String buscarLibroPorTitulo(String titulo) {
        StringBuilder sb = new StringBuilder();
        for (Libro libro : libros.values()) {
            if (libro.getNombre().equalsIgnoreCase(titulo)) {
                sb.append(libro.toString()).append("\n");
            }
        }
        return sb.toString();
    }

    public boolean actualizarPrecio(Integer id, double nuevoPrecio) {
        Libro libro = libros.get(id);
        if (libro != null) {
            libro.setPrecio(nuevoPrecio);
            return true;
        }
        return false;
    }

    public double precioTotal() {
        double total = 0;
        Iterator<Map.Entry<Integer, Libro>> it = libros.entrySet().iterator();
        while (it.hasNext()) {
            Libro lib = it.next().getValue();
            total += lib.getPrecio();
        }
        return total;
    }

    public int totalLibros() {
        return libros.size();
    }

    public Libro masCaro() {
        Iterator<Map.Entry<Integer, Libro>> it = libros.entrySet().iterator();
        Integer id = 0;
        while (it.hasNext()) {
            Libro l = it.next().getValue();
            id = (l.compareTo(this.libros.get(id)) > 0) ? l.getId() : id;
        }
        return obtenerLibro(id);
    }

    public Libro masBarato() {
        Iterator<Map.Entry<Integer, Libro>> it = libros.entrySet().iterator();
        Integer id = 0;
        while (it.hasNext()) {
            Libro l = it.next().getValue();
            id = (l.compareTo(this.libros.get(id)) < 0) ? l.getId() : id;
        }
        return obtenerLibro(id);
    }
}