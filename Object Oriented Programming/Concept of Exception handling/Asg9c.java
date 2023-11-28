public class Asg9c {
    public static void main(String[] args) {
        try {
            // Attempting to access a method on a null reference
            String str = null;
            int length = str.length(); // This will result in a NullPointerException
            System.out.println("Length of the string: " + length); // This line won't be executed
        } catch (NullPointerException e) {
            // Handling the NullPointerException
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } finally {
            // Code in the finally block will be executed whether an exception occurs or not
            System.out.println("Finally block executed");
        }
    }
}

