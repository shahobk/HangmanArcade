/*
 * Hangman Game by Shahob Kazemi and Ariadne Marangozis
 * ISU
 * Mr. Mah
 * ICS 4U1
 */
package hangmancars;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class WordReaderCountries{
    private static final String fileName = "/res/countries.txt"; // sets the file name to the designated text file for the game

    private ArrayList<String> wordsCars = new ArrayList<String>(); //generates the words into strings from the text file.

    public WordReaderCountries() {
        try (InputStream in = getClass().getResourceAsStream(fileName); // getClass() returns the class, getResourceAsStream()
                                                                        // grabs the words from the file and parse's it
                                                                        // into a input stream.
                BufferedReader bf = new BufferedReader(new InputStreamReader(in))) { // makes the file readable

            String line = ""; // temporary storage
            while ((line = bf.readLine()) != null) // if not null, then it will obtain a random word from the file
                wordsCars.add(line); // outputs a word onto the screen from the selected file
        }
        catch (Exception e) {
            System.out.println("Couldn't find/read file: " + fileName); // outputs these messages when the file cannot be read, or become corrupt
            System.out.println("Error message: " + e.getMessage());     //
        }
    }

    public String getRandomWord() { // word is randomly taken from the textfile selected.
        if (wordsCars.isEmpty()) return "NO-DATA"; // if the file is missing or corrupted, it will send this message
        return wordsCars.get((int)(Math.random()*wordsCars.size())); // If program is set, it will begin the game chosing a random word from the file.
    }
}