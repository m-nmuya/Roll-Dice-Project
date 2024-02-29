  /*
  Marie Muya
  Coded: 3/27/23
  Purpose: To construct a class dice class satisfies the previously provided and used dice.class based on review of dice documentation 
  PMR: The code in jGrasp in the same that was written in my notebook. I mainly based it off of the 
  dice documentaton given which allowed me to create the following class.
 */
import java.util.*;

public class Dice extends java.lang.Object{
    private int sides;
    private int faceValue;
    
    public Dice(){
        sides = 6;
    }
    
    public Dice​(int numSides){
        sides = numSides;
    }
    
    public int getNumSides(){
        return sides;
    }
    
    public int getFaceValue(){
        return faceValue;
    }
    
    
    public int roll(){
        faceValue = (int)(Math.random() * (sides + 1));
        return faceValue;
    }
    
    public java.lang.String toString(){
        return "The current face value for this dice with " + sides + " number of sides is " + faceValue;
    }

}