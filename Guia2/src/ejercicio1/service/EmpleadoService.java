package ejercicio1.service;

import ejercicio1.model.Empleado;
import ejercicio1.model.EmpleadoContratista;
import ejercicio1.model.EmpleadoPorHora;
import ejercicio1.model.EmpleadoTiempoCompleto;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpleadoService {
    public Empleado nuevoEmpleado(Scanner sc) {
        int horas = 0;
        double valorProyecto = 0;
        System.out.println("1\ttiempo completo\n2\tPor Hora\n3\tContratista");
        sc.nextLine();
        int option = sc.nextInt();
        sc.nextLine();
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Salario:");
        double salario = sc.nextDouble();
        switch (option) {
            case 1:
                return new EmpleadoTiempoCompleto(nombre, salario);
            case 2:
                sc.nextLine();
                System.out.println("Horas trabajadas:");
                horas = sc.nextInt();
                return new EmpleadoPorHora(nombre, salario, horas);
            case 3:
                System.out.println("Horas trabajadas:");
                horas = sc.nextInt();
                System.out.println("Valor del proyecto:");
                valorProyecto = sc.nextDouble();
                return new EmpleadoContratista(nombre, salario, horas, valorProyecto);
            default:
                System.out.println("Opcion incorrecta");
                break;

        }

        return null;
    }
    public Empleado buscarPorId(ArrayList<Empleado> empleados,int id){
        for(Empleado empleado:empleados){
            if(empleado.getId()==id)
                return empleado;
        }
        return null;
    }
    public void mostrarPago(Empleado empleado){
        System.out.println("Salario empleado: " + empleado.calcularPago());
    }
}
