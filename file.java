
import java.util.*;
import java.io.*;

public class file {

    public static void main(String[] args) throws IOException {
        PrintWriter outputFile = new PrintWriter("people.txt");
        outputFile.println("Sara");
        outputFile.println("Lily");
        outputFile.println("Angelina");
        
        outputFile.close();
        
        File myFile = new File("people.txt"); //Opens file
        Scanner inputFile = new Scanner(myFile); //Creates Scanner object to read from file
        
        String str = inputFile.nextLine(); //str grabs the first line in the file
        
        System.out.println(str); //Prints out str
        
        inputFile.close();
        
        File peopleFile = new File("people.txt"); //opening file
        Scanner inputFile2 = new Scanner(peopleFile); //reading file
        
        while(inputFile2.hasNext()) // loop until end of file
        {
            String name = inputFile2.nextLine(); //creates a variable "name" to store each line of the text
            System.out.println(name); //prints whjatever is stored in the varibale
        }
        
        inputFile2.close();
    }
    
}
