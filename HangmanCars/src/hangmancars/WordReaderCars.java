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


                    /*REFER TO "WordReaderCountries.java" for comments*/

public class WordReaderCars{
    private static final String fileName = "/res/cars.txt";

    private ArrayList<String> wordsCars = new ArrayList<String>();

    public WordReaderCars() {
        try (InputStream in = getClass().getResourceAsStream(fileName);
                BufferedReader bf = new BufferedReader(new InputStreamReader(in))) {

            String line = "";
            while ((line = bf.readLine()) != null)
                wordsCars.add(line);
        }
        catch (Exception e) {
            System.out.println("Couldn't find/read file: " + fileName);
            System.out.println("Error message: " + e.getMessage());
        }
    }

    public String getRandomWord() {
        if (wordsCars.isEmpty()) return "NO-DATA";
        return wordsCars.get((int)(Math.random()*wordsCars.size()));
    }
}