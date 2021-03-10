
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = Integer.valueOf(scanner.nextLine());
        int numberTwo = Integer.valueOf(scanner.nextLine());
        
        divisibleByThreeInRange(numberOne, numberTwo);
    }
    
    public static void divisibleByThreeInRange(int begining, int end) {
        for( int i = begining; i <=end; i++ ) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

}
