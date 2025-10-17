package entidades;

import java.io.*;
import java.util.ArrayList;

import excepciones.TipoInvalidoE;

public class Vivero {
    private String archivoPlantas;
    private String archivoAccesorios;
    private String archivoDecoraciones;
    private String archivoTickets;

    public Vivero(String archivoPlantas, String archivoAccesorios, String archivoDecoraciones, String archivoTickets) {
        this.archivoPlantas = archivoPlantas;
        this.archivoAccesorios = archivoAccesorios;
        this.archivoDecoraciones = archivoDecoraciones;
        this.archivoTickets = archivoTickets;
    }

    private <T> String validarTipo(T prod) throws TipoInvalidoE{
        String nombreArchivo;
        if(prod instanceof Planta)
            nombreArchivo=archivoPlantas;
        else if(prod instanceof Accesorio)
            nombreArchivo=archivoAccesorios;
        else if(prod instanceof Decoracion)
            nombreArchivo=archivoDecoraciones;
        else if(prod instanceof Ticket)
            nombreArchivo=archivoTickets;
        else throw new TipoInvalidoE();
        return nombreArchivo;
    }

    public <T> void agregar(T prod) throws TipoInvalidoE,IOException{
        String nombreArchivo=validarTipo(prod);
        BufferedWriter buffer=new BufferedWriter(new FileWriter(nombreArchivo,false));
        buffer.write(prod.toString());
        buffer.newLine();
        buffer.close();
    }
    public ArrayList<String> cargar(String archivo){
        ArrayList <String> base=new ArrayList<>();
        int contadorLineas=1;
        try {
            BufferedReader buffer = new BufferedReader(new FileReader(archivo));
            String entrada= buffer.readLine();
            while(entrada!=null) {
                base.add(entrada);
                entrada = buffer.readLine();
            }
        }
        catch(FileNotFoundException e){
            System.out.println("No se pudo abrir el archivo "+ archivo);
        } catch (IOException e) {
            System.out.println("Fallo al leer linea: "+contadorLineas);
        }
        return base;
    }

    public void eliminar(){

    }


}
