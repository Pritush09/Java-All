public class Asg9a {
    public static void main(String[] args) {
        try {
            // Attempting to perform divide by zero
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator;
            
            // This line will not be executed if an exception occurs in the above statement
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catching and handling the ArithmeticException
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println("Exception origin: " + e.getClass().getName());
        }
    }
}
