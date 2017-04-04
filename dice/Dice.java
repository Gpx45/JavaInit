
package dice;
import java.util.*;
import java.lang.*;

public class Dice {

    public int rollDice(int sides) {
    
        double randomNumber = Math.random();
      
        randomNumber = randomNumber * sides;
        randomNumber = randomNumber + 1;
        
        int randomInt = (int) randomNumber;
        return randomInt;
    }
    
    public int keepRolling() {
    int dice1, dice2, dice3, dice4, dice5;
    int count = 0;
    do {
        Dice rollingDice = new Dice();
        
    
    dice1 = rollingDice.rollDice(6);
    dice2 = rollingDice.rollDice(6);
    dice3 = rollingDice.rollDice(6);
    dice4 = rollingDice.rollDice(6);
    dice5 = rollingDice.rollDice(6);
    count++;
    
    }while(!(dice1 == dice2 && dice2 == dice3 && dice3 == dice4 && dice4 == dice5));
        
    return count;
    }
    
    public static void main(String[] args) {
    
    int rolledNum;
    
    Dice sixSideDice = new Dice();
    
    rolledNum = sixSideDice.rollDice(6);
   
    
    System.out.println("Roll 1: " + rolledNum);
    System.out.println(sixSideDice.keepRolling());
    
    }
    
}
