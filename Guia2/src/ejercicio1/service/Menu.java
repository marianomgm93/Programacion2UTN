package ejercicio1.service;

import ejercicio1.model.Empleado;
import ejercicio1.model.EmpleadoPorHora;
import util.ClearConsole;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private int lineas = 25;


    public void menuEmpleados(Scanner sc, ArrayList<Empleado> empleados) {
        ClearConsole.clear(this.lineas);
        boolean continuar = true;
        int option;
        do {
            System.out.println("0\tSalir\n1\t por hora\n2\tTiempo Completo\n3\tContratista");
            option=sc.nextInt();
            switch (option){
                case 0:
                    continuar=false;
                    break;
                case 1:
                    menuEmpleadosPorHora(sc,empleados);
                    break;
            }
        } while (continuar);
    }

    public void menuEmpleadosPorHora(Scanner sc,ArrayList<Empleado> empleados) {
        EmpleadoService empleadoService=new EmpleadoService();
        int id;
        boolean continuar = true;

        int option;
            ClearConsole.clear(this.lineas);
        do {
            System.out.println("Empleados por hora:");
            System.out.println("0\tSalir\n1\tNuevo empleado\n2\tVer empleados\n3\tcalcular pago");
            option=sc.nextInt();
            switch (option){
                case 0:
                    continuar=false;
                    break;
                case 1:
                    empleados.add(empleadoService.nuevoEmpleado(sc));
                    break;
                case 2:
                    for(Empleado empleado:empleados) {
                        if (empleado instanceof EmpleadoPorHora)
                            System.out.println(empleado);
                    }
                    break;
                case 3:
                    System.out.println("Ingrese ID de empleado");
                    sc.nextLine();
                    id=sc.nextInt();
                    empleadoService.mostrarPago(empleadoService.buscarPorId(empleados,id));
                    break;
            }
        }while(continuar);
    }

    public void menuEmpleadosTiempoCompleto(Scanner sc) {
        boolean continuar = true;
        ClearConsole.clear(this.lineas);
        System.out.println("0\tSalir\n1\tNuevo empleado\n2\tVer empleados\n3\tcalcular pago");

    }

    public void menuEmpleadosContratista(Scanner sc) {
        boolean continuar = true;
        ClearConsole.clear(this.lineas);
        System.out.println("0\tSalir\n1\tNuevo empleado\n2\tVer empleados\n3\tcalcular pago");

    }
}
