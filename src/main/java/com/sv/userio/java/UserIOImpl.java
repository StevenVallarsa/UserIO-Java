package com.sv.userio.java;

import java.util.Scanner;

/**
 *
 * @author: Steven Vallarsa
 *   email: stevenvallarsa@gmail.com
 *    date: 2022-01-08
 * purpose: Practice creating a UserIO interface and implementation
 */
public class UserIOImpl implements UserIO {
    
    Scanner scanner = new Scanner(System.in);

    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public String readString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    @Override
    public int readInt(String prompt) {
        
        while(true) {
            
            System.out.println(prompt);
            String input = scanner.nextLine();
            
            try {
                
                int parsedInt = Integer.parseInt(input);
                return parsedInt;
                
            } catch(NumberFormatException e) {
                System.out.println("That was no integer. Try again.");
            }
        }
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        while(true) {
            
            int input = readInt(prompt);
            if (input > min && input < max) {
                return input;
            }
            
            System.out.println("That number wasn't in range. Try again.\n");
            
        }
    }
}
