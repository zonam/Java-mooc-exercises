
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 1; i <= number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise    
        int i = 1;
        int j = size - 1;

        while (i <= size && j >= 0) {
            printSpaces(j);
            printStars(i);
            i++;
            j--;
        }
    }

    public static void christmasTree(int height) {
        int i = 1;
        int j = height - 1;
        
        while (i <= height * 2 && j >= 0) {
            printSpaces(j);
            printStars(i);
            i = i + 2;
            j--;
            if (j == -1) {
                printSpaces(height - 2);
                System.out.println("***");
                printSpaces(height - 2);
                System.out.println("***");
            }
        }

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(4);
        System.out.println("---");
        
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
