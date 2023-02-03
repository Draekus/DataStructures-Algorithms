package HW3;

/*
 *  Patrick Gould
 *  CSC-242-01
 *  Collections HW 20.1
 * 
 *  This program reads in a text file called Gettysburg.txt 
 *  and uses the Collections interface to sort each word
 *  in ascending order and then prints the list of words
 *  to the console
 */

import java.util.*;
import java.io.FileNotFoundException;
import java.io.File;

public class Main {
    public static void main(String[] args) {

		try {
             // Initialize input scanner & open input file
			File myObj = 
            new File("/workspaces/DataStructures-Algorithms/HW3/Gettysburg.txt");
			Scanner myReader = new Scanner(myObj);

            // Create list of words
		    List<String> list = new ArrayList<>();

            // Read lines from file 
            while(myReader.hasNext()) {
                // Split the line into individual words
                String[] words_arr = myReader.nextLine().split(" ");
                // Iterate over the array of words
                for (String word: words_arr) {
                    // Convert each word to lowercase and remove punctuation
          			word = word.toLowerCase().replaceAll("[^a-z]", "");
          			word = word.replaceAll(" ", "");
                    // Add the word to the list if it isn't already contained in the list
                    if (!list.contains(word)) {
                        list.add(word);
                    }
                    
                }
				
            }
            // Sort the list in ascending alphabetical order & print it to the screen
		    Collections.sort(list);
            System.out.println(list);
			
			myReader.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Error: File not found");
			e.printStackTrace();
		}

	}

}
