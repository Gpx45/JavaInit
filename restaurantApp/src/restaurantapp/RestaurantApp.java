/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantapp;
import java.util.*;

public class RestaurantApp {

    public static void main(String[] args) {
       
    HashMap<String, Integer> restaurantMenu = new HashMap<String, Integer>();
  
       restaurantMenu.put("Turkey Burger", 13);
       restaurantMenu.put("Naan Pizza", 11);
       restaurantMenu.put("Cranberry Kale Salad", 10);
       System.out.println(restaurantMenu.get("Naan Pizza"));
       
       System.out.println(restaurantMenu.size());
       
       for (String item : restaurantMenu.keySet()) {       
           System.out.println("A " + item + " costs " + restaurantMenu.get(item) + " dollars.");
       }
    }
    
}
