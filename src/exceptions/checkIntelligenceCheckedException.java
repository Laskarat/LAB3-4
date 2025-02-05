package exceptions;

public class checkIntelligenceCheckedException extends Exception{ // ПРОВЕРЯЕМОЕ ИСКЛЮЧЕНИЕ
    public checkIntelligenceCheckedException(String message) {
        super(message);
    }

    public String getMessage(String message) {
        return message;
    }
}