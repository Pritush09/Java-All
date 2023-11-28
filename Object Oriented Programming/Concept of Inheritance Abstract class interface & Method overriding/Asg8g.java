// Interface for calculating the mean of numbers
interface MeanInterface {
    double mean(double[] numbers);
}

// Interface extending MeanInterface for calculating the deviation from mean
interface DeviationInterface extends MeanInterface {
    double deviation(double[] numbers);
}

// Concrete class implementing both interfaces
class MeanDeviationCalculator implements DeviationInterface {
    @Override
    public double mean(double[] numbers) {
        if (numbers.length == 0) {
            return 0; // Handle special case to avoid division by zero
        }

        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    @Override
    public double deviation(double[] numbers) {
        double mean = mean(numbers);
        double sumSquaredDifferences = 0;

        for (double number : numbers) {
            double difference = number - mean;
            sumSquaredDifferences += difference * difference;
        }

        return Math.sqrt(sumSquaredDifferences / numbers.length);
    }
}

public class Asg8g {
    public static void main(String[] args) {
        double[] numbers = {1.0, 2.0, 3.0, 4.0, 5.0};

        // Creating an object of MeanDeviationCalculator
        MeanDeviationCalculator calculator = new MeanDeviationCalculator();

        // Calculating and displaying the mean and deviation
        System.out.println("Mean: " + calculator.mean(numbers));
        System.out.println("Deviation: " + calculator.deviation(numbers));
    }
}

