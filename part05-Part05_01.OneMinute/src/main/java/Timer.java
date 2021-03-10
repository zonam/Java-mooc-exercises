/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manojtimilsina
 */
public class Timer {

    private ClockHand hundredsOfSecond;
    private ClockHand seconds;

    public Timer() {
        this.hundredsOfSecond = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance() {
        this.hundredsOfSecond.advance();

        if (this.hundredsOfSecond.value() == 0) {
            this.seconds.advance();

        }
    }

    public String toString() {
        return seconds + ":" + hundredsOfSecond;
    }
}


