
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        //Part 1
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            list.add(input);

        }

        //part 2
        int smallNumber = list.get(0);

        for (int number : list) {

            if (number < smallNumber) {
                smallNumber = number;
            }
        }
        System.out.println("Smallest number: " + smallNumber);

        //part 3
        for (int i = 0; i < list.size(); i++) {

            if (smallNumber == list.get(i)) {
                System.out.println("Found at index: " + i);
            }
        }

    }
}
