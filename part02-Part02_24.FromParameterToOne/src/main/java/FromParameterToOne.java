
import java.util.Scanner;



public class FromParameterToOne {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int value = Integer.valueOf(scanner.nextLine());
        printFromNumberToOne(value);
    }
    
    public static void printFromNumberToOne(int number) {
    
        for (int i = number; i >=1; i-- ) {
            System.out.println(i);
        }
    }

}

