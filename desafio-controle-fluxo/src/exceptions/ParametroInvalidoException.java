package exceptions;

public class ParametroInvalidoException extends RuntimeException {
    public ParametroInvalidoException() {
        super("O segundo parametro deve ser MAIOR que o primeiro");
    }
}
