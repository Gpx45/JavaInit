/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
/**
 *
 * @author Victor
 */
public class ArrLists {


    public static void main(String[] args)
    {

        ArrayList<Integer> weeklyTemperatures = new ArrayList<Integer>();
        weeklyTemperatures.add(78);
        weeklyTemperatures.add(67);
        weeklyTemperatures.add(89);
        weeklyTemperatures.add(94);
        System.out.println(weeklyTemperatures.get(1));
        weeklyTemperatures.add(2,300);
        System.out.println(weeklyTemperatures.get(2));

        //This loop iterates through the array lsit and ouputs them to the console.

        for (int j = 0; j < weeklyTemperatures.size();j++)
        {
        System.out.println(weeklyTemperatures.get(j));

        }
        System.out.println("\n");

        for (Integer temperature : weeklyTemperatures)
        {
        System.out.println(temperature);

        }
    }


}
