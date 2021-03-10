/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manojtimilsina
 */
public class Fitbyte {
    private int age;
    private int restingHeart;
    
    public Fitbyte( int age, int restingHeart) {
        this.age = age;
        this.restingHeart = restingHeart;
    }
    
    public double targetHeartRate (double percentageOfMaximum) {
        double maxHeartRate = 206.3 - (0.711 * this.age);
        return (maxHeartRate - this.restingHeart) * percentageOfMaximum + this.restingHeart;
    }
}
