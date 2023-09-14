/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inclass;

import java.util.*;

/**
 *
 * @author mwhite23
 */
public class InClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = keyboard.nextLine();
        
        //Looping through a string and outputting each letter on a seperate line
        for(int counter=0;counter<name.length();counter++){
            System.out.println(name.charAt(counter));
        }
        
        //Getting the first character of the name string
        char letter = name.charAt(0);
        //Creating a int variable
        int shift = 3;
        
        //Output letter - letter is a character
        System.out.println(letter);
        
        //Output letter as an integer (from ASCII or unicode encoding systems)
        System.out.println((int)letter);
        
        //Adding the shift (+3) to the numeric value of the letter - note the (int) casting of letter
        int newLetter = (int) letter + shift;
        System.out.println(newLetter);
        
        //Output the new letter as a character - note the char casting of newLetter
        System.out.println((char)newLetter);
        
        
        
    }
    
}
