package Ejercicio2;

import java.util.Stack;

public class Pila <T>{
    private Stack<T> pila;

    public Pila() {
        this.pila=new Stack<>();
    }

    public void agregar(T objeto){
        pila.push(objeto);
    }
    public T sacar(){
        return pila.pop();
    }
    public String mostrarPila(){
        StringBuilder sb=new StringBuilder();
        sb.append("Pila:\n");
        for(T t:pila)
            sb.append(t).append("\n");
        sb.append("Fin Pila...");
        return sb.toString();
    }

}
