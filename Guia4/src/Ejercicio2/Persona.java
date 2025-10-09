package Ejercicio2;

public class Persona {
	private Integer dni;
	private String nombre = "";
	private String sexo = "H";
	private double peso = 0;
	private double altura = 0;
	private int edad=0;

	public Persona(){

	}
	public Persona(Integer dni){
		this.dni=generaDNI();
	}
	public Persona(String nombre, String sexo, double peso, double altura,int edad){
		this.dni=generaDNI();
		this.nombre=nombre;
		this.sexo=sexo;
		this.peso=peso;
		this.altura=altura;
		this.edad=edad;
	}

	public int getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	/**
	 * ➢ calcularIMC(): calculará si la persona está en su peso ideal
 (peso en kg/(altura^2 en m)), si esta fórmula devuelve un valor
 menor que 20, la función devuelve un-1, si devuelve un número
 entre 20 y 25 (incluidos), significa que está por debajo de su
 peso ideal la función devuelve un 0 y si devuelve un valor mayor
 que 25 significa que tiene sobrepeso, la función devuelve un 1.
 Te recomiendo que uses constantes para devolver estos
 valores
	*/
	public int calcularIMC(){
		double masa=this.peso/Math.pow(this.altura, 2);
		return (masa<20) ? -1 : (masa>=20 && masa<=25) ? 0 : 1;
	}
	/**
	 * esMayorDeEdad(): indica si es mayor de edad, devuelve un
	 * booleano.
	*/

	public boolean esMayorDeEdad(){
		return (this.edad>18);
	}
	/**
	 * comprobarSexo(char sexo): comprueba que el sexo introducido
	 * es correcto. Si no es correcto, será H. No será visible al exterior.
 	*/
 	public void comprobarSexo(String sexo){
 		if(!this.sexo.equalsIgnoreCase(sexo))
 			this.sexo="H";
 	}
 	/**
 	 * generaDNI(): genera un número aleatorio de 8 cifras, genera a
 partir de este su número su letra correspondiente. Este método
 será invocado cuando se construya el objeto. Puedes dividir el
 método para que te sea más fácil. No será visible al exterior.
 	*/
 	public Integer generaDNI(){
 		return (int) (Math.random()*100000000);
 	}
 	@Override
 	public String toString() {
 		StringBuilder sb=new StringBuilder();
 		sb.append("DNI: ").append(this.dni).append("\n");
 		sb.append("Nombre: ").append(this.nombre).append("\n");
 		sb.append("Edad: ").append(this.edad).append("\n");
 		sb.append("Sexo: ").append(this.sexo).append("\n");
 		sb.append("Altura: ").append(this.altura).append("\n");
 		sb.append("Peso: ").append(this.peso).append("\n");
 		return sb.toString();
 	}
}