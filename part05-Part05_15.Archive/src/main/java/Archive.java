/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manojtimilsina
 */


public class Archive {

    private String name;
    private String identifier;

    public Archive(String identifier, String name) {
        this.name = name;
        this.identifier = identifier;
    }

   
    @Override
    public boolean equals(Object compared) {
        
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Archive)) {
            return false;
        }
        
        // convert the Object type compared object
        // into a Archive type object called comparedArchive
        Archive comparedArchive = (Archive) compared;
        
        // if the values of the object variables are the same, the objects are equal
        if (this.identifier.equals(comparedArchive.identifier)) {
        
            return true;
        }

        return false;
    }

    @Override
    public String toString() {

        return this.identifier + ": " + this.name;
    }

}
