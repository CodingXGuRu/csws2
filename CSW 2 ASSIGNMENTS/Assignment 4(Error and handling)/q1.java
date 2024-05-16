package ErrorHandling;

public class q1 {

    @SuppressWarnings("null")
    public static void main(String[] args) {

        String str = null;
        try {
            int size = str.length();
            System.out.println("Size of string is :" + size);
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }
    }

}