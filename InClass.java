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
    }
    
}
