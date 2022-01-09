package com.sv.userio.java;

/**
 *
 * @author: Steven Vallarsa
 *   email: stevenvallarsa@gmail.com
 *    date: 2022-01-08
 * purpose: Practice creating a UserIO interface and implementation
 */
public class App {
    
    public static void main(String[] args) {
        
        UserIO userIO = new UserIOImpl();
        
        int smallNum = userIO.readInt("Give me a small number:");
        int bigNum = userIO.readInt("Now give me a big number:");
        
        // Swap numbers if they are opposite
        if (bigNum < smallNum) {
            userIO.print("Hey! " + smallNum + " is bigger than " + bigNum + ". Luckily I can fix that.");
            int temp = smallNum;
            smallNum = bigNum;
            bigNum = temp;
        } else if (bigNum == smallNum) {
            userIO.print("Hey! Those numbers are the same. Luckily I can fix that.");
            
            // if numbers are the same check to make sure big number
            // won't go over Integer max, and change one of the other
            // number to keep from causing exception
            if (bigNum + 100 > Integer.MAX_VALUE) {
                smallNum -= 100;
            } else {
                bigNum += 100;
            }
        }
        
        int middleNum = userIO.readInt("Now give a number between " + smallNum + " and " + bigNum + ":", smallNum, bigNum);
        userIO.print("Ohhhh... I like that number!");
        
        
    }
}
