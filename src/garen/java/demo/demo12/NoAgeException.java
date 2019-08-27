package garen.java.demo.demo12;

public class NoAgeException extends RuntimeException{
    public NoAgeException() {
        super();
    }

    public NoAgeException(String message) {
        super(message);
    }
}
