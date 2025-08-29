package ejercicio1;

import ejercicio1.model.Empleado;
import ejercicio1.service.Menu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *  1. Modela un sistema que gestione empleados de una empresa. Cada
 *  empleado tiene un nombre, un salario y un método calcularPago() que
 *  debe ser implementado de manera específica para cada tipo de empleado:
 *  a. Implementa las siguientes clases: ejercicio1.model.Empleado (clase base abstracta),
 *  EmpleadoTiempoCompleto y EmpleadoPorHoras. Para los empleados
 *  a tiempo completo, el método calcularPago() debe retornar el salario
 *  mensual, mientras que para los empleados por horas, debe retornar
 *  el salario calculado según las horas trabajadas. Utiliza polimorfismo
 *  para invocar el método calcularPago() adecuado para cada
 *  empleado.
 *  b. Ahora, agrega la clase "EmpleadoContratista" que representa a
 *  empleados contratados por proyectos específicos. Esta nueva clase
 *  de empleado tiene un salario basado en el número de horas
 *  trabajadas y una tarifa por proyecto.
 *  c. Permite al usuario realizar las operaciones necesarias mediante un
 *  menú
 */
public class ej1 {
    public static void main(String[] args) {
        Menu menu=new Menu();
        Scanner sc=new Scanner(System.in);
        ArrayList <Empleado> empleados=new ArrayList<>();
        menu.menuEmpleados(sc,empleados);
    }
}