import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Hello,daddy");

        char continuar;
        int opcion;
        int opcion4;


        do {
            System.out.println("Ingrese su opcion,daddy");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    Empleado carlos = new Empleado("23456345", "Carlos", "Gutierrez", 25000.0);
                    Empleado ana = new Empleado("34234123", "Ana ", "Sánchez", 27500.0);

                    System.out.println(carlos.toString());
                    System.out.println(ana.toString());

                    carlos.aumentarSalario(15);
                    System.out.println("Nuevo salario de carlos: " + carlos.getSalario());

                    break;
                case 2:
                    /**
                     *  En el main, realice las siguientes operaciones:
                     *  1. Inicialice una cuenta con un monto inicial de 15000.
                     *  2. Realice una operación de crédito de 2500
                     */

                    CuentaBanco cuenta = new CuentaBanco("juan", 15000);
                    cuenta.mostrarCuenta();
                    cuenta.credito(2500);
                    System.out.println("Operacion credito");
                    cuenta.mostrarCuenta();
                    break;

                case 3:
                    /**
                     * a. Inicializa un libro con el título "El Quijote", autor "Miguel de
                     * Cervantes", precio 500, y 10 copias disponibles.
                     * b. Inicializa otro libro con el título "Cien Años de Soledad", autor
                     * "Gabriel García Márquez", precio 700, y 5 copias disponibles.
                     * c. Imprime los detalles de ambos libros.
                     * d. Vende 3 copias del primer libro.
                     * e. Imprime los detalles del primer libro.
                     * f.
                     * Intenta vender 8 copias del segundo libro.
                     * g. Incrementa en 5 la cantidad de copias disponibles del segundo libro.
                     * h. Imprime los detalles del segundo libro.
                     */

                    Libro anios_Soledad = new Libro(5, 700.0, "Gabriel garcia Merca", "Cien Años de Soledad");
                    Libro quijote = new Libro(10, 500.0, "Miguel de cervantes", "El Quijote");

                    System.out.println(quijote.toString());
                    System.out.println(anios_Soledad.toString());

                    quijote.vender(3);
                    System.out.println(quijote.toString());

                    anios_Soledad.vender(8);
                    anios_Soledad.incrementarCant(5);
                    System.out.println(anios_Soledad.toString());

                    break;

                case 4:
                    /**
                     * 1. Agregar ítem: Inicializa un objeto ItemVenta con valores proporcionados por
                     * el usuario.
                     * 2. Imprime el objeto usando el método correspondiente.
                     * 3. Permite al usuario ingresar una nueva cantidad y actualiza el atributo
                     * cantidad del ítem de venta.
                     * 4. Permite al usuario ingresar un nuevo precio unitario y actualiza el atributo
                     * precioUnitario del ítem de venta.
                     * 5. Imprime el precio total calculado por el método calcularPrecioTotal().
                     * 6. Sale del programa.
                     */


                    char continuar4;

                    ItemVenta item = new ItemVenta();

                    do {
                        System.out.println("Ingrese la opcion del ejercicio: 1 agregar, 2,imprimir, 3 actualizar,4 nuevo precio,5,calcular precio,6 salir ");
                        opcion4 = leer.nextInt();

                        switch (opcion4) {


                            case 1:
                                System.out.println("Ingrese la descripcion del item <3");
                                item.setDescripcion(leer.next());

                                System.out.println("Ingrese la cantidad del item");
                                item.setCantidad(leer.nextInt());
                                System.out.println("Ingrese el precio de cada unidad");
                                item.setPrecioUnitario(leer.nextDouble());


                                break;

                            case 2:
                                System.out.println(item.toString());
                                break;

                            case 3:
                                System.out.println("Ingrese una nueva cantidad de item: ");
                                item.setCantidad(leer.nextInt());


                                break;

                            case 4:
                                System.out.println("Ingrese el nuevo precio unitario");
                                item.setPrecioUnitario(leer.nextDouble());

                                break;

                            case 5:
                                System.out.println("El precio total de los items es: " + item.calcular_precio_total());

                                break;

                            case 6:
                                System.out.println("bai bai");
                                break;

                            default:
                                System.out.println("Sos pelotudo?");
                                break;

                        }
                        System.out.println("pulse s para continuar");
                        continuar4 = leer.next().charAt(0);


                        }
                        while (continuar4 == 's' || continuar4 == 'S') ;

                            default:
                                System.out.println("Dale, mete una opcion valida,boludito");
                                break;

                        }



                        System.out.println("Si desea continuar, pulse S");
                        continuar = leer.next().charAt(0);
                    } while (continuar == 's' || continuar == 'S');


            }
        }
