
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
         
         int wins = 0;
         int loss = 0;
         
        
        
        System.out.println("File:");
        String file = scan.nextLine();
        
        System.out.println("Team:");
        String team = scan.nextLine();
        
        ArrayList<String> list = new ArrayList<>();
        
        try(Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                
                String[] parts = line.split(",");
                
                list.add(line); // add garnalai
                
                String teamOne = parts[0];
                String teamTwo = parts[1];
                
                int points1 = Integer.valueOf(parts[2]);
                int points2 = Integer.valueOf(parts[3]);
                
                if (parts[0].equalsIgnoreCase(team) && points1 > points2 || parts[1].equalsIgnoreCase(team) && points2 > points1) {
                    wins++;
                } else if (parts[0].equalsIgnoreCase(team) || parts[1].equalsIgnoreCase(team)) {
                    loss++;
                }
            }
            
        } catch (Exception e) {
            System.out.println("");
        }
        
        int games = wins + loss;
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + loss);
       

    }

}
