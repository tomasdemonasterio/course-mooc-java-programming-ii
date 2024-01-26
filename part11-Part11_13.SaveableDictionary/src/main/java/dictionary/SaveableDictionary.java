/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author set
 */
import java.util.HashMap;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.io.PrintWriter;

public class SaveableDictionary {

    private HashMap<String, String> dictionary;
    private HashMap<String, String> dictionaryReverse;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
        this.dictionaryReverse = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }

    public void add(String words, String translation) {
        if (!this.dictionary.containsKey(words) && !this.dictionaryReverse.containsKey(words) && !this.dictionary.containsKey(translation) && !this.dictionaryReverse.containsKey(translation)) {
            this.dictionary.put(words, translation);
            this.dictionaryReverse.put(translation, words);
        }
    }

    public String translate(String word) {
        String translation = this.dictionary.get(word);
        if (translation == null) {
            return this.dictionaryReverse.get(word);
        }
        return translation;
    }

    public void delete(String word) {
        String translation = this.dictionary.get(word);
        if (translation == null) {
            String wordTrans = this.dictionaryReverse.get(word);
            this.dictionaryReverse.remove(word);
            this.dictionary.remove(wordTrans);
        }
        String wordTrans = this.dictionary.get(word);
        this.dictionary.remove(word);
        this.dictionaryReverse.remove(wordTrans);
    }

    public boolean load() {
        try {
            Files.lines(Paths.get(this.file)).map(s -> s.split(":")).filter(s -> s.length >= 2).forEach(s -> this.add(s[0], s[1]));

        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(this.file);
            for (String key : this.dictionary.keySet()) {
                writer.println(key + ":" + this.dictionary.get(key));
            }
            writer.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
