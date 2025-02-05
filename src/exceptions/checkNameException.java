package exceptions;

public class checkNameException extends RuntimeException{ // НЕПРОВЕРЯЕМОЕ ИСКЛЮЧЕНИЕ
    public checkNameException(String message) {
        super(message);
    }

    public String getMessage(String message) {
        return message;
    }
}
