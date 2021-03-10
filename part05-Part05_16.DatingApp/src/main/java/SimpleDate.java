
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
   
    // part 1
    public void advance () {
        this.day += 1;
        
        if (day > 30) {
            this.month += 1; // same as thi.month = this.month + 1;
            this.day = 1;
            
            if (month > 12) {
                this.year += 1;
                this.month = 1;
            }
        }
    }
    
    // part 2
    public void advance (int howManyDays) {
       for (int i = 0; i < howManyDays; i++ ) {
           advance();
       }
    }
    
    // Part 3
    
    public SimpleDate afterNumberOfDays (int days) {
        SimpleDate newDate = new SimpleDate (this.day, this.month, this.year);
        
        for (int i = 0; i < days; i++) {
            newDate.advance();
        }
        return newDate;
    }
}
