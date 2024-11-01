package exceptions;

public class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException() {
        super("cannot do this operation cause don't have enough balance");
    }
}
