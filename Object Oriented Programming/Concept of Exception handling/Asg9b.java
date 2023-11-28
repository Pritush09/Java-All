public class Asg9b {
    public static void main(String[] args) {
        int[] array = new int[10];

        try {
            // Attempting to assign a value to an out-of-bounds index (index 15)
            array[15] = 42;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
            // Printing the origin of the exception
            System.out.println("Exception origin: " + e.getClass().getName());
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
            // Re-throwing the caught exception
            throw e;
        }
    }
}
