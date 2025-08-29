package ejercicio1.service;

import ejercicio1.model.Empleado;
import ejercicio1.model.EmpleadoContratista;
import ejercicio1.model.EmpleadoPorHora;
import ejercicio1.model.EmpleadoTiempoCompleto;
import util.ClearConsole;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private int lineas = 25;


    public void menuEmpleados(Scanner sc, ArrayList<Empleado> empleados) {
        EmpleadoService empleadoService = new EmpleadoService();
        int id;
        boolean continuar = true;

        int option;
        ClearConsole.clear(this.lineas);
        do {
            System.out.println("Empleados por hora:");
            System.out.println("0\tSalir\n1\tNuevo empleado\n2\tVer empleados\n3\tcalcular pago");
            option = sc.nextInt();
            switch (option) {
                case 0:
                    continuar = false;
                    break;
                case 1:
                    empleados.add(empleadoService.nuevoEmpleado(sc));
                    break;
                case 2:
                    System.out.println("1\tPor hora\n2\tTiempo Completo\n3\tContratista");
                    option = sc.nextInt();
                    sc.nextLine();
                    switch (option) {
                        case 1:
                            for (Empleado empleado : empleados) {
                                if (empleado instanceof EmpleadoPorHora)
                                    System.out.println(empleado);
                            }
                            break;
                        case 2:
                            for (Empleado empleado : empleados) {
                                if (empleado instanceof EmpleadoTiempoCompleto)
                                    System.out.println(empleado);
                            }

                            break;
                        case 3:

                            for (Empleado empleado : empleados) {
                                if (empleado instanceof EmpleadoContratista)
                                    System.out.println(empleado);
                            }
                            break;

                    }
                    break;
                    
                case 3:
                    System.out.println("Ingrese ID de empleado");
                    sc.nextLine();
                    id = sc.nextInt();
                    empleadoService.mostrarPago(empleadoService.buscarPorId(empleados, id));
                    break;
            }
        } while (continuar);
    }

}
