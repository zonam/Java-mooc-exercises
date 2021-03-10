
import java.util.Scanner;

public class SquareRootOfSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int first = Integer.valueOf(scanner.nextLine());
        int second = Integer.valueOf(scanner.nextLine());
       
        //int square1 = first * first;
        //int square2 = second * second;
       
        //int number = square1 + square2;
        
        int squareRoot1 = (int) Math.sqrt(first);
        int squareRoot2 = (int) Math.sqrt(second);
        
        int squareRootOfSum = (int) (double) (squareRoot1 + squareRoot2);
              
        System.out.println(squareRootOfSum);
    
    
    }
}



       
    
