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

public class WordReaderDictionary {
    private static final String fileName = "/res/words.txt";

    private ArrayList<String> wordsSuperHeroes = new ArrayList<String>();

    public WordReaderDictionary() {
        try (InputStream in = getClass().getResourceAsStream(fileName);
                BufferedReader bf = new BufferedReader(new InputStreamReader(in))) {

            String line = "";
            while ((line = bf.readLine()) != null)
                wordsSuperHeroes.add(line);
        }
        catch (Exception e) {
            System.out.println("Couldn't find/read file: " + fileName);
            System.out.println("Error message: " + e.getMessage());
        }
    }

    public String getRandomWord() {
        if (wordsSuperHeroes.isEmpty()) return "NO-DATA";
        return wordsSuperHeroes.get((int)(Math.random()*wordsSuperHeroes.size()));
    }
}
