
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sumPositive = 0;
        double amountPositive = 0;

        while (true) {
            System.out.println("");
            int number = Integer.valueOf(scanner.nextLine());

            if (number > 0) {
                sumPositive = number + sumPositive;
                amountPositive = 1 + amountPositive;
            } else if (number == 0) {
                break;
            }
        }

        if (sumPositive <= 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(sumPositive / amountPositive);
        }

    }
}
