
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros();
        int newCents = this.cents + addition.cents();
        if (newCents > 99) {
            newEuros = newEuros + newCents/100;
            newCents = newCents % 100;
        }
        return new Money(newEuros, newCents);
    }
    
    public boolean lessThan(Money compared) {
       
       boolean isLessThan = false;
       
       if ((100 * this.euros + this.cents) < (100 * compared.euros() + compared.cents())) {

            isLessThan = true;
        }

        return isLessThan;
    
    }
    
    public Money minus(Money decreaser) {
        int eurosM = this.euros - decreaser.euros();
        int centsM = this.cents - decreaser.cents();
        
        if (centsM < 0) {
            centsM += 100;
            eurosM -= 1;
        }
        
        // if diff is negative, return zero
        if (eurosM < 0) {
            return new Money(0, 0);
        }
       return new Money(eurosM, centsM);
       
    }

}
