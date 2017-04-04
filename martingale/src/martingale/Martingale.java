/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martingale;

/**
 *
 * @author Victor
 */
public class Martingale {
    
    int money = 1000;
    int target = 1200;
    int bet = 10;
    
    public int martingale() {
    
    while(money>bet) {
    
        boolean win = play();
        if (win) {
            money += bet;
            bet = 10;
        }
        else {
            money -= bet;
            bet *= 2;
        }
        
    
    }
    return money;
}

    
    public static void main(String[] args) {
       
        
        
    }
    
}
