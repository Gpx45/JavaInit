/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package likes;

/**
 *
 * @author Victor
 */
public class Likes {

    public int likePhoto(int currentLikes, String comment, boolean like) {
        
        System.out.println("Feedback: " + comment);
    if (like) {
        currentLikes = currentLikes + 1;
    }
    
    return currentLikes;
   }
    
    public static void main(String[] args) {
   
    Likes myLikes = new Likes();
    
    int returnedLikes = myLikes.likePhoto(0, "Thats Awesome", true); 
    int totalLikes = myLikes.likePhoto(returnedLikes, "I like This Photto", true);
    }
    
}
