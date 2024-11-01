package exceptions;

public class NotAllowedAmountException extends RuntimeException{
    public NotAllowedAmountException() {
        super("cannot do this operation cause this amount is not allowed");
    }
}
