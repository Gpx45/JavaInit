/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomarray;


public class RandomArray {

    
    public void news() {
    
        String [] newsOutLet = {"ABC", "BBC", "CNN", "CBS", "AP", "NBC", "FOX", "NPR", "SKY", "Aljazeera"};
       
        double stationChoice = Math.random();
        stationChoice *= 10;
        
        int choice = (int) stationChoice;
        
        System.out.println(newsOutLet[choice]);
        
        
    
    }
   
    public static void main(String[] args) {
        RandomArray arr = new RandomArray();
        arr.news();
        
    }
    
}
