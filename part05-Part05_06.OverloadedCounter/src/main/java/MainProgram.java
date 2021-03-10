
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        
        Counter c = new Counter(8);
        
        c.decrease(-10);
        c.increase(15);
        System.out.println(c.value());
       
    }
}
