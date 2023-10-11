package shubhaDhang.exception;

public class StudentEmptyException extends RuntimeException{
    public StudentEmptyException(String message) {
        super(message);
    }

    public StudentEmptyException(String message, Throwable cause) {
        super(message, cause);
    }
}
