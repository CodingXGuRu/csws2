package ErrorHandling;

@SuppressWarnings({ "serial" })
class CustomNullPointerException extends RuntimeException {
    public CustomNullPointerException(String message) {
        super(message);
    }
}

public class q3 {
    public static void main(String[] args) {

        String input = null;

        try {
            if (input == null)
                throw new CustomNullPointerException("Input string is null.");
        } catch (CustomNullPointerException e) {
            System.err.println(e.getMessage());
        }
    }

}