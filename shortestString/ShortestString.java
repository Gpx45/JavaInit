/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shorteststring;



public class ShortestString {
    
public String getLongString(String[] longString) {

    int sizeOfArr = longString.length;
    String longestString = longString[0];
    for (int p = 0; p < sizeOfArr; p++) {
        if (longString[p].length() > longestString.length()) {
        longestString = longString[p]; 
        
        }
    
    }
return longestString;
}
   
    public static void main(String[] args) {
        String[] names = {"Nakita", "Elina", "Sheree", "Guy", "Calandra", "Perry", "Heike", "Harris", "Lynsey", "Issac"};
        
        ShortestString thisString = new ShortestString();
        
        System.out.println(thisString.getLongString(names));
        
        
    }
    
}
