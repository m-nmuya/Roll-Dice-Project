/*
  Marie Muya
  Coded: 3/14/23
*/
import java.util.*;



public class diceRoller
{
   public static void main (String args[])
   {
    rollDie1();                // method for die1 called
    rollDie2();                // method for die2 called    
   
   }
   
   //RANDOM CLASS DIE 1
   public static void rollDie1()   //method declared
   {
   Random rand = new Random();
   
   int die1 = rand.nextInt((6-1) + 1) + 1;                         // if use (6) only includes zero as possible result
   
   System.out.println("Die 1 is " + die1);
    
   }
   
   
   //MATH CLASS DIE 2
   public static void rollDie2()
   {
   int die2 = (int)(Math.random() * 6 + 1);                         // if use (6) only includes zero as possible result
   
   System.out.println("Die 2 is " + die2);
    
   
    
   }

}