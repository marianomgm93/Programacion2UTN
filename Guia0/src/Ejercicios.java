import java.util.Scanner;

public class Ejercicios {
    Scanner leer = new Scanner(System.in);

    public Ejercicios() {
    }

    /**
     * 1. Realizar un programa Java que realice lo siguiente: declarar una variable
     * numN de tipo int, una variable numA de tipo double y una variable numC de
     * tipo char y asigna a cada una un valor. A continuación muestra por pantalla:
     * El valor de cada variable, la suma de numN + numA, la diferencia de numA -
     * numN, el valor numérico correspondiente al carácter que contiene la
     * variable numC.
     *
     * @Params: no param.
     */
    public void ej1() {
        int numN = 0;
        double numA = 1;
        char numC = 'T';
        System.out.println("nuN+NumA= " + (numN + numA) + "\nNumA-numN= " + (numA - numN) + "\nnumC= " + (int) numC);
    }

    /**
     * 2. Realizar un programa Java que realice lo siguiente: declarar dos variables
     * numX y numY de tipo int, dos variables numN y numM de tipo double y
     * asigna a cada una un valor. A continuación mostrar por pantalla una serie
     * de operaciones entre ellas.
     *
     * @Params no param
     */
    public void ej2() {
        int numX = 1, numY = 2;
        double numN = 3, numM = 4;
        System.out.println("X+Y= " + (numX + numY) + "\nY-X= " + (numY - numX) + "\nN*M= " + (numN * numM) + "\nM/Y= " + (numM / numY));

    }

    /**
     * 3. Realizar un programa Java que declare una variable entera N y se le asigne
     * un valor elegido por el usuario. A continuación escribe las instrucciones para
     * que el programa realice lo siguiente: incrementar N en 77, reducir su valor a 3,
     * duplicar su valor
     */
    public void ej3() {
        System.out.println("Pone el numero, boludon\n");
        int N = leer.nextInt();
        System.out.println("\nplus 77: " + (N + 77) + "\nMinus 3: " + (N - 3) + "\nEl doble del numero: " + (N * 2));


    }

    /**
     * 4. Realizar un programa Java que declare cuatro variables enteras A, B, C y D
     * y se le asigne un valor a cada una. A continuación realiza las instrucciones
     * necesarias para que: B tome el valor de C, C tome el valor de A, A tome el
     * valor de D, D tome el valor de B.
     *
     * @Params no param.
     */
    public void ej4() {
        int a = 4, b = 3, c = 2, d = 1, aux;
        System.out.println("===Inicio===\nA= " + a + "\nB= " + b + "\nC= " + c + "\nD= " + d);
        aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;
        System.out.println("A= " + a + "\nB= " + b + "\nC= " + c + "\nD= " + d + "\n===Fin===");
    }

    /**
     * 5. Realizar un programa Java que declare una variable A de tipo entero,
     * y le asigne un valor. A continuación mostrar un mensaje indicando si A
     * es par o impar.
     *
     * @Params no params.
     */
    public void ej5() {
        int A = 4;
        System.out.println((A % 2 == 0) ? "par" : "impar");
    }

    /**
     * 6. Realizar un programa Java que declare una variable B de tipo entero y
     * asignarle un valor elegido por el usuario. A continuación mostrar un
     * mensaje indicando si el valor de B es positivo o negativo
     */
    public void ej6() {
        int B;
        System.out.println("Mete el numero, gaturrin");
        B = leer.nextInt();
        System.out.println((B < 0) ? "Negativo" : "Positivo");
    }

    /**
     * 7. Realizar un programa Java que encuentre el valor ASCII de un carácter.
     * Para ello, vamos a pedir un String al usuario y leer solo el primer carácter,
     * esto lo lograremos con: char caracter = scanner.next().charAt(0);
     *
     * @Params no param.
     */
    public void ej7() {
        char letra;
        System.out.println("Ingrese un caracter");
        letra = leer.next().charAt(0);
        System.out.println((int) letra);
    }

    /**
     * 8. Realizar un programa Java que declare una variable C de tipo entero y le
     * asigne un valor elegido por el usuario. A continuación mostrar un mensaje
     * indicando si el valor de C es positivo o negativo, si es par o impar, si es
     * múltiplo de 5, si es múltiplo de 10 y si es mayor o menor que 100
     */
    public void ej8() {
        System.out.println("Ingresa tu numero papi");
        int C = leer.nextInt();
        System.out.println(((C < 0) ? "Es negativo" : "Es positivo") +
                "\n" +
                ((C % 2 == 0) ? "Es par" : "Es impar") +
                "\n" +
                ((C % 5 == 0) ? "Es multiplo de 5" : "No es multiplo de 5") +
                "\n" +
                ((C % 10 == 0) ? "Es multiplo de 10" : "No es multiplo de 10") +
                "\n" +
                ((C < 100) ? "Es menor a 100" : "Es mayor a 100"));
    }

    /**
     * 9. Realizar un programa Java que lea un nombre y muestre por pantalla:
     * “Buenos días, {NOMBRE}”.
     */
    public void ej9() {
        String nombre;
        System.out.println("Ingrese su nombre");
        nombre = leer.nextLine();
        System.out.println("Buenos dias!! " + nombre);
    }

    /**
     * 10. Realizar un programa que lee por teclado el valor del radio de una
     * circunferencia, calcula y muestra por pantalla la longitud y el área de la
     * circunferencia. Cálculo de longitud: 2 * PI * radio, cálculo de área: PI *
     * radio^2. Para este ejercicio averiguar sobre la clase Math
     */

    public void ej10() {
        System.out.println("Dale boludito, mete el radio");
        float radius = leer.nextFloat();
        System.out.println("Longitud: " + (2 * Math.PI * radius) + "\nArea: " + (Math.pow(Math.PI * radius, 2)));
    }

    /**
     * 11. Realizar un programa que pase una velocidad en Km/h a m/s. La
     * velocidad se lee por teclado. Cálculo: velocidadMS = velocidadKm * 1000 /
     * 3600
     *
     * @Params no params.
     */
    public void ej11() {
        System.out.println("Ingrese la velocidad en Km/h");
        double velocidad = leer.nextDouble();
        System.out.println((velocidad * 1000 / 3600));
    }

    /**
     * 12. Realizar un programa que lea la longitud de los catetos de un triángulo
     * rectángulo y calcule la longitud de la hipotenusa según el teorema de
     * Pitágoras.
     *
     * @Params no params.
     */
    public void ej12() {
        int catetoOpuesto, catetoAdyacente;
        System.out.println("longitud del cateto opuesto: ");
        catetoOpuesto = leer.nextInt();
        leer.nextLine();
        System.out.println("longitud del cateto Adyacente: ");
        catetoAdyacente = leer.nextInt();
        leer.nextLine();
        System.out.printf("%.2f%n", Math.sqrt(Math.pow(catetoAdyacente, 2) + Math.pow(catetoOpuesto, 2)));
    }

    /**
     * 13. Realizar un programa que calcula el volumen de una esfera. El valor de
     * radio se debe pedir por teclado. Cálculo: volumen = 4/3 * PI * radio^3
     */
    public void ej13() {
        System.out.println("Ingrese el radio de la esfera:");
        double radio = leer.nextDouble();
        System.out.println("volumen = " + 4 / 3 * Math.PI * Math.pow(radio, 3));
    }

    /**
     * 14. Realizar un programa que lee un número de 3 cifras y muestra sus
     * cifras por separado
     */
    public void ej14() {
        System.out.println("Ingrese un numero para separar:");
        int numero = leer.nextInt();
        String numString = "" + numero;
        for (int i = 0; i < numString.length(); i++) {
            System.out.println(numString.charAt(i));
        }
    }

    /**
     * 15. Realizar un programa que lea un número entero N de 5 cifras y muestre
     * las cifras que ocupan posiciones impares
     */
    public void ej15() {
        System.out.println("Ingrese un entero de 5 cifras: ");
        int num = leer.nextInt();
        String numStr = String.valueOf(num);
        for (int i = 0; i < numStr.length(); i++) {
            System.out.println(((i + 1) % 2 == 0) ? "" : ("Cifra " + (i + 1) + " es impar = " + numStr.charAt(i)));
        }
    }

    /**
     * 16. Realizar un programa que lea tres números enteros H, M, S que
     * contienen hora, minutos y segundos respectivamente, y comprueba si la
     * hora que indican es una hora válida.
     */
    public void ej16() {
        int horas, minutos, segundos;
        System.out.println("Ingrese horas");
        horas = leer.nextInt();
        System.out.println("Ingrese minutos");
        minutos = leer.nextInt();
        System.out.println("Ingrese segundos");
        segundos = leer.nextInt();
        System.out.println(((horas >= 0 && horas <= 24) && (minutos >= 0 && minutos <= 60) && (segundos >= 0 && segundos <= 60)) ? "Hora valida" : "Hora invalida");
    }

    /**
     * 17. Realizar un programa Java que pida por teclado el nombre, edad y
     * salario de una persona, y muestra el salario dependiendo de:
     * ● Siesmenorde16notiene edad para trabajar
     * ● Entre19 y 50 años el salario es un 5 por ciento más
     * ● Entre51 y 60 años el salario es un 10 por ciento más
     * ● Siesmayorde60elsalario es un 15 por ciento más
     */
    public void ej17() {
        int edad;
        System.out.println("Ingrese edad:");
        edad = leer.nextInt();
        System.out.println((edad < 16) ? "no tiene edad para trabajar" :
                (edad >= 16 && edad <= 18) ? "Sueldo pelado" :
                        (edad >= 19 && edad <= 50) ? "5 por ciento más" :
                                (edad >= 51 && edad < 60) ? "10 por ciento más" : "15 por ciento más");
    }

    /**
     * 18. Crea un programa que pida al usuario su altura y su peso, y muestre por
     *  pantalla su índice de masa corporal y si se encuentra en un rango
     *  saludable
     *  Bajo peso	Menos de 18,4
     * Peso normal	18,5 a 24,9
     * Sobrepeso	25 a 29,9
     * Obesidad Grado I	30 a 34,9
     * Obesidad Grado II	35 a 39,9
     * Obesidad Grado III	Igual o mayor a 40
     */
    public void ej18(){
        double peso,altura,imc;
        System.out.println("Ingrese altura");
        altura=leer.nextDouble();
        System.out.println("Ingrese peso");
        peso=leer.nextDouble();
        imc=peso/Math.pow(altura,2);
        System.out.println((imc<=18.4) ? "Bajo peso" :
                (imc<25) ? "Peso normal" :
                        (imc<30) ? "Sobrepeso" :
                                (imc<35) ? "Obesidad Grado I" :
                                        (imc<40) ? "Obesidad Grado II" : "Obesidad Grado III");

    }

    /**
     * 19. Realizar un programa Java que calcule el promedio de un arreglo de
     *  números enteros. Realizar variantes con arreglos ya inicializados e ingreso
     *  por teclado
     */
    public void ej19(){
        int option;
        System.out.println("1-Carga manual\n2-Carga automatica");
        option=leer.nextInt();
        switch (option){
            case 1:

        }
    }

    private int[] cargarArrManual(){
        char option='y';
        int[] arr;
        do{
            System.out.println("Ingrese un numero");
            /*
            *
            * COMPLETAR---
            * */

        }while(Character.toLowerCase(option)=='y');
    }
    private double promediarArr(int [] arr){
        int suma=0;
        if (arr == null) {
            return -1;
        }
        for(int num:arr){
            suma+=num;
        }
        return (double)suma/arr.length();
    }

}


