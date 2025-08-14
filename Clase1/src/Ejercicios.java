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
     * @Params no param.
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

    public  void ej10()
        {
            System.out.println("Dale boludito, mete el radio");
            float radius=leer.nextFloat();
            System.out.println("Longitud: "+(2*Math.PI*radius)+"\nArea: "+(Math.pow(Math.PI*radius,2)));
        }

}


