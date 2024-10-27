package se.ericnorrwing.globalerrorhandlerdemo.exception;

public class UserCouldntReadException extends RuntimeException{

    public UserCouldntReadException(String message) {
        super(message);
    }

    public UserCouldntReadException(String message, Throwable cause) {
        super(message, cause);
    }
}
