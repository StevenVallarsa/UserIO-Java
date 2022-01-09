package com.sv.userio.java;

/**
 *
 * @author: Steven Vallarsa
 *   email: stevenvallarsa@gmail.com
 *    date: 2022-01-08
 * purpose: Practice creating a UserIO interface and implementation
 */

public interface UserIO {
    
    void print(String message);
    String readString(String prompt);
    int readInt(String prompt);
    int readInt(String prompt, int min, int max);
    
}
