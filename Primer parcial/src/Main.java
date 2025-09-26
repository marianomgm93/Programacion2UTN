import Clases.Garaje;
import Enums.Tamanno;
import Enums.TipoAuto;
import Enums.TipoMovimiento;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Garaje g=new Garaje();
        g.nuevoAuto("Renault",2020,"asd123", TipoAuto.SEDAN);
        g.nuevoAuto("Peugeot",2019,"asd233", TipoAuto.SEDAN);
        g.nuevoPropietario("Juan",123654,456321);
        g.nuevoPropietario("Quimey",954654,456551);
        ArrayList<Integer> permitidos=new ArrayList<>();
        permitidos.add(123654);
        permitidos.add(654321);
        permitidos.add(153214);
        /// NUEVA POSICION
        g.nuevaPosicion(0,permitidos,0, Tamanno.GRANDE);
        System.out.println(g.mostrarPosiciones());
        /// MOSTRAR POSICION POR NUMERO
        System.out.println(g.mostrarPosicion(0));
        /// CAMBIAR PROPIETARIO
        g.cambiarPropietario(0,1);
        System.out.println(g.mostrarPosicion(0));
        /// cambiar vehículo de una posición (prevenir vehículos duplicados) (en base a número)
        g.cambiarVehiculo(0,1);
        System.out.println(g.mostrarPosiciones());
        ///  Agregar un autorizado a una posición (en base a número)
        g.agregarAutorizado(123159,0);
        ///Limpiar los autorizados de una posición(en base a número)
        /*System.out.println(g.mostrarPosiciones());
        g.limpiarAutorizados(0);
        System.out.println(g.mostrarPosiciones());*/
        /// marcar un movimiento (chequear que el movimiento lo realice alguien autorizado)
        g.nuevoMovimiento(0, TipoMovimiento.SALIDA, 123654);
        System.out.println(g.mostrarPosiciones());

        ///  ver movimientos

        System.out.println(g.mostrarMovimientos());
    }
}