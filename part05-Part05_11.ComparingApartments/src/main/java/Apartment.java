
import static java.lang.Math.abs;


public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {       
        if (this.squares > compared.squares) {
            return true;
        }
        
        return false;
        
    }
    
    public int priceDifference(Apartment compared) {
        int difference = (this.pricePerSquare * this.squares) - (compared.pricePerSquare * compared.squares);
        return abs(difference);
     
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        int priceOne = this.pricePerSquare * this.squares;
        int priceTwo = compared.pricePerSquare * compared.squares;
        
        if(priceOne > priceTwo) {
            return true;
        }
        
        return false;
    }
    
}
