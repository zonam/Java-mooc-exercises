
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Last number?");
        int number = Integer.valueOf(scanner.nextLine());
        int totalSum = 0;
        
        for (int i = 0; i <= number; i++) {
            totalSum += i; // totalSum = totalSum + i;           
        }
        
        System.out.println("The sum is " + totalSum);
    }
}
