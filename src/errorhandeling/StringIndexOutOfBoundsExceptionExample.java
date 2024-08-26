package errorhandeling;

public class StringIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        String text = "Hello";  

        try {
            char character = text.charAt(10);
            System.out.println("Character at index 10: " + character);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: String index is out of bounds.");
            
        }
    }
}

