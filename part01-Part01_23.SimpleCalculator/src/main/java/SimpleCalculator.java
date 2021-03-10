
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int x = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        int y = Integer.valueOf(scanner.nextLine());
        
        int addition = x + y;
        int substraction = x - y;
        int multiplication = x * y;
        double division = 1.0 * x / y;
        
        System.out.println(x + " + " + y + " = " + addition);
        System.out.println(x + " - " + y + " = " + substraction);
        System.out.println(x + " * " + y + " = " + multiplication);
        System.out.println(x + " / " + y + " = " + division);
              
    }
}
