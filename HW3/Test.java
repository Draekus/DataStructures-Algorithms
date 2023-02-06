package HW3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        validateArgs(args);
        File file = new File(args[0]);
        List<String> words = getWordsFromFile(file);
        Collections.sort(words);
        printWords(words);
    }

    private static void printWords(List<String> words) {
        for (String word : words) {
            System.out.println(word);
        }
    }

    private static List<String> getWordsFromFile(File file) {
        List<String> words = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                words.add(scanner.next());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error reading from file");
            System.exit(2);
        }
        return words;
    }

    private static void validateArgs(String[] args) {
        if (args.length != 1) {
            System.out.println("Wrong number of arguments.");
            System.exit(1);
        }
    }
}
