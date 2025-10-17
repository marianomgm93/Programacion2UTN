package entidades;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import excepciones.TipoInvalidoE;

public class Vivero {
    private String archivoPlantas;
    private String archivoAccesorios;
    private String archivoDecoraciones;
    private String archivoTickets;

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
        BufferedWriter buffer=new BufferedWriter(new FileWriter(nombreArchivo,true));
        buffer.write(prod.toString());
        buffer.newLine();
        buffer.close();
    }



}
