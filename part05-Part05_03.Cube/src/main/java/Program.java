
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Experiment with your program here
        Cube oSheaJackson = new Cube(4);
        System.out.println(oSheaJackson.volume());
        System.out.println(oSheaJackson);

        System.out.println();
        
        Cube manojTimilsina = new Cube(2);
        System.out.println(manojTimilsina.volume());
        System.out.println(manojTimilsina);

    }
}
