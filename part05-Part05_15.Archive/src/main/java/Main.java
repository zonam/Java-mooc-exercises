
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Archive> archives = new ArrayList<>();

        while (true) {

            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            
            if (identifier.isEmpty()) {                
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {   
                break;
            }


            Archive newItem = new Archive(identifier, name);
            
            /*if (!archives.contains(identifier)) {
                archives.add(newItem);
            }
            /*Same as above*/
            
            if (archives.contains(newItem)) {
                System.out.println();
            } else {
                archives.add(newItem); 
            }
        }
        
        System.out.println("==Items==");
        
        for (Archive printItem : archives) { 
           
            System.out.println(printItem);

        }
    }
}
