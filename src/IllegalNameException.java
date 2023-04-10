import java.util.concurrent.ExecutionException;

public class IllegalNameException extends ExecutionException {

    public IllegalNameException(String message) {
        super(message);
    }
}
