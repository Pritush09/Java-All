// Superclass for exceptions related to mathematical operations
class MathException extends Exception {
    public MathException(String message) {
        super(message);
    }
}

// Subclass representing an overflow exception
class OverflowException extends MathException {
    public OverflowException(String message) {
        super(message);
    }
}

// Subclass representing an underflow exception
class UnderflowException extends MathException {
    public UnderflowException(String message) {
        super(message);
    }
}

public class Asg9d {
    public static void main(String[] args) {
        try {
            int value = 150; // Set an integer value

            // Check if the value is greater than 100
            if (value > 100) {
                // If greater than 100, throw OverflowException
                throw new OverflowException("Overflow Exception: Value is greater than 100");
            } else if (value < 100) {
                // If less than or equal to 100, throw UnderflowException
                throw new UnderflowException("Underflow Exception: Value is less than or equal to 100");
            }

        }catch (OverflowException e) {
            // Catching the specific OverflowException
            System.out.println("Caught OverflowException: " + e.getMessage());
        } catch (UnderflowException e) {
            // Catching the specific UnderflowException
            System.out.println("Caught UnderflowException: " + e.getMessage());
        }
        // catch (MathException e) {
        //     // Catching the generic MathException
        //     System.out.println("Caught MathException: " + e.getMessage());
        //     // Re-throwing the caught exception
        //     // throw e;
        // }
    }
}
