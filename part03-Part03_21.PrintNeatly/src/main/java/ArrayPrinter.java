
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
       
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
       // System.out.println(" ");
        int i = 0;
        String separator = ""; // separator in this case as ","
        while (i < array.length) {
            int neat = array[i];
            System.out.print( separator + neat);
            separator = ",";
            i = i + 1;
        }
        
    }
}
