  /*
  Marie Muya
  Coded: 3/14/23
  Purpose: To code a simulation of dice rolling
  PMR: Initially in the code I wrote in the code, I was not 100% sure where I should 
  take the code. I initially thought i had to start from scratch to create the runner
  and the dice class, but I realized that I needed to just focuse on the dice runner.
 */
public class DiceRunner extends Dice {
   public static void main(String args[]) {
      Dice dice1 = new Dice();
      Dice dice2 = new Dice();
      diceStats_v1(dice1);
      diceStats_v2(dice1, dice2);
      diceStats_v3(dice1, dice2);
     }

   public static void diceStats_v1(Dice dice){
    int numOfRolls = 0;
    int result = 0;
    while (result!= 4){
      result =  dice.roll();
       numOfRolls++;
      System.out.println("The amount of rolls: " + numOfRolls + "; and how many it took to get 4: " + result);
       }
     }
   public static void diceStats_v2(Dice dice1, Dice dice2){
     int numOfSum7 = 0;
     int result1 = 0;
     int result2 = 0;
     int sum = 0;
     for (int i = 0; i <=15; i++){
       result1 = dice1.roll();
       result2 = dice2.roll();
       sum = result1 + result2;
       if (sum == 7){
          numOfSum7++;
         }
       }
     System.out.println("The # of time the sum equals of dice 1 and dice 2 equals 7 is " + numOfSum7);
     }
    
    
     public static void diceStats_v3(Dice dice1, Dice dice2){
      int roll1 = 0;
      int roll2 = 0;
      int numOfRolls = 0;
      while((roll1 != 1) && (roll2 != 1)){
       roll1 = dice1.roll();
       roll2 = dice2.roll();
       numOfRolls++;
      }
      System.out.print("The # of rolls it took to land a snake eyes is " + numOfRolls);
     }
}
