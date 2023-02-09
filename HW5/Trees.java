package HW5;

/*
 *  Patrick Gould
 *  CSC-242-01
 *  Collections HW 22.2
 * 
 *  This program reads in a text file called Gettysburg.txt 
 *  and uses a TreeMap data structure to represent each word
 *  as a non-duplicate list in ascending order then prints it
 *  to the console
 */

import java.util.*;
import java.io.FileNotFoundException;
import java.io.File;

public class Trees {
    public static void main(String[] args) {

		try {
            // Validate that there is only one argument
            validateArguments(args);
             // Initialize input scanner & open input file
			File myObj = new File(args[0]);
			Scanner myReader = new Scanner(myObj);

            // Creating an empty TreeMap
            TreeSet<String> words_tree = new TreeSet<String>();

            // Read lines from file 
            while(myReader.hasNext()) {
                // Split the line into individual words
                String[] words_arr = myReader.nextLine().split(" ");
                
                
                // Iterate over the array of words
                for (String word: words_arr) {
                    // Convert each word to lowercase and remove punctuation
          			word = word.toLowerCase().replaceAll("[^a-z]", "");
          			word = word.replaceAll(" ", "");
                    
                    // Add the word to the treeset
                    words_tree.add(word);
                    
                }
				
            }
            
            // Print the treeset of words to the screen
            System.out.println("Printing words in ascending alphabetical order:\n");
            System.out.println(words_tree);
			
			myReader.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Error: File not found");
			e.printStackTrace();
		}

	}

    private static void validateArguments(String[] args) {
        if (args.length != 1) {
            System.out.println("Wrong number of arguments.");
            System.exit(1);
        }
    }

}
