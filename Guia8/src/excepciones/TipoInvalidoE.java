package excepciones;
public class TipoInvalidoE extends Exception {

    public TipoInvalidoE(){
        super("El tipo de dato ingresado es incompatible");
    }
}
