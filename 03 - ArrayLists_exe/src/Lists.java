/*
 * MIT 
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author MSilva
 */
public class Lists {

    // variables of object ===========================   
    private ArrayList<String> lista = new ArrayList<>();
    private int max_phrases = 10;

    // CONSTRUCTOR ===================================    
    public Lists(int max_size) {
        max_phrases = max_size;
    }

    // METHODS ======================================= 
    /**
     * adds a sentence to the arraylist if the limit of the list is still not filled
     *
     * @param sentence
     */
    public void addSentence(String sentence) {
        if (lista.size() < this.max_phrases) {
            lista.add(sentence);
        }
    }


    /**
     * gets the biggest string from the array list
     *
     * @return
     */
    public String biggestSentence() {
        return Collections.max(this.lista, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {

                return Integer.compare(a.length(), b.length());

            }
        });
    }

    /**
     * gets the smallest string from the array list
     *
     * @return
     */
    public String smallestSentence() {

        return Collections.min(this.lista, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {

                return Integer.compare(a.length(), b.length());

            }
        });
    }

    @Override
    public String toString() {

        for (int i = 0; i < lista.size(); i++) {
            return lista.toString();
        }
        return "";
    }

    /**
     * method to swap the items of the array list
     *
     * @param
     */
    public void sortList() {
        Collections.sort(this.lista, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o2.length(), o1.length());
            }
        });
    }

}
