

import java.util.Scanner;
import java.nio.file.Paths;

public class NumbersFromAFile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Lower bound?");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound?");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int count = 0;

        try ( Scanner reader = new Scanner(Paths.get(file))) {
            
            while (reader.hasNextLine()) {
                int row = Integer.valueOf(reader.nextLine());
                if (row >= lowerBound && row <= upperBound) {
                    count++;
                }
            }
            
            System.out.println("Numbers: " + count);

        } catch (Exception e) {
            System.out.println();
        }
    }
}
