package Ejercicio2;

import java.util.HashMap;

public class Ej2 {
	public static void main(String[] args) {
		// 1. Hombre adulto
		Persona individuo1 = new Persona("Ricardo Palma", "H", 82.3, 1.83, 40);

		// 2. Mujer adulta
		Persona individuo2 = new Persona("Laura Soto", "M", 61.0, 1.65, 28);

		// 3. Hombre mayor
		Persona individuo3 = new Persona("Javier Montes", "H", 70.5, 1.75, 65);

		// 4. Mujer joven (adolescente)
		Persona individuo4 = new Persona("Camila Vargas", "M", 55.7, 1.72, 16);

		// 5. Hombre con menor estatura y peso
		Persona individuo5 = new Persona("Pedro Núñez", "H", 68.0, 1.68, 35);
		HashMap<Integer,Persona> personas= new HashMap<>();
		personas.put(individuo1.getDni(), individuo1);
		personas.put(individuo2.getDni(), individuo2);
		personas.put(individuo3.getDni(), individuo3);
		personas.put(individuo4.getDni(), individuo4);
		personas.put(individuo5.getDni(), individuo5);



	}
}
/*
 * 2. Hazunaclase llamada Persona que siga las siguientes condiciones:
 * Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso
 * y altura. No queremos que se accedan directamente a ellos. Piensa
 * que modificador de acceso es el más adecuado, también su tipo. Si
 * quieres añadir algún atributo puedes hacerlo.--
 * Por defecto, todos los atributos menos el DNI serán valores por
 * defecto según su tipo (0 números, cadena vacía para String, etc.).
 * Sexo sera hombre por defecto, usa una constante para ello.
 * Se implantaran varios constructores:
 * ■ Unconstructor por defecto.
 * ■ Unconstructor con el nombre, edad y sexo, el resto por
 * defecto.
 * ■ Unconstructor con todos los atributos como parámetro.
 * Los métodos que se implementarán son:
 * ➢ calcularIMC(): calculará si la persona está en su peso ideal
 * (peso en kg/(altura^2 en m)), si esta fórmula devuelve un valor
 * menor que 20, la función devuelve un-1, si devuelve un número
 * entre 20 y 25 (incluidos), significa que está por debajo de su
 * peso ideal la función devuelve un 0 y si devuelve un valor mayor
 * que 25 significa que tiene sobrepeso, la función devuelve un 1.
 * Te recomiendo que uses constantes para devolver estos
 * valores.
 * ➢ esMayorDeEdad(): indica si es mayor de edad, devuelve un
 * booleano.
 * ➢ comprobarSexo(char sexo): comprueba que el sexo introducido
 * es correcto. Si no es correcto, será H. No será visible al exterior.
 * ➢ toString(): devuelve toda la información del objeto.
 * ➢ generaDNI(): genera un número aleatorio de 8 cifras, genera a
 * partir de este su número su letra correspondiente. Este método
 * será invocado cuando se construya el objeto. Puedes dividir el
 * método para que te sea más fácil. No será visible al exterior.
 * ➢ Métodossetdecadaparámetro, excepto de DNI.
 * Ahora, crea una clase ejecutable que haga lo siguiente:
 * Pide por teclado el nombre, la edad, sexo, peso y altura.--
 * Crea 3 objetos de la clase anterior, el primer objeto obtendrá las
 * anteriores variables pedidas por teclado, el segundo objeto obtendrá
 * todos los anteriores menos el peso y la altura y el último por defecto,
 * para este último utiliza los métodos set para darle a los atributos un
 * valor.
 * Crea una Collection donde se guardarán los objetos anteriormente
 * creados. Dichos objetos deben estar asociados a su DNI. Pensar que
 * Collection es la más adecuada.
 * Para cada objeto, se deberá comprobar si está en su peso ideal, tiene
 * sobrepeso o está por debajo de su peso ideal con un mensaje.
 */