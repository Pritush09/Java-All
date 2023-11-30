class Calculation {
    private int a;
    private int b;

    public Calculation(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public synchronized void add() {
        int c = a;
        int d = b;

        try {
            Thread.sleep(500); // Sleep for 0.5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int sum = c + d;
        System.out.println("Addition Result: " + sum);
    }

    public synchronized void increase() {
        a += 5;
        b += 5;

        try {
            Thread.sleep(500); // Sleep for 0.5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Increased Values: a = " + a + ", b = " + b);
    }
}

public class Asg10b {
    public static void main(String[] args) {
        Calculation calculation = new Calculation(10, 20);

        // Create threads for add and increase methods
        Thread addThread = new Thread(() -> {
            calculation.add();
        });

        Thread increaseThread = new Thread(() -> {
            calculation.increase();
        });

        // Start the add thread first
        addThread.start();

        // Wait for the add thread to finish before starting the increase thread
        try {
            addThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        increaseThread.start();
    }
}

