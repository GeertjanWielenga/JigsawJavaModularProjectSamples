package org.wordlibrary.technical;

import com.wordlibrary.WordLibrary;

/**
 * Implementation of the logic for the Anagram Game application.
 */
public final class TechnicalWordLibrary extends WordLibrary {

    @Override
    public String toString() {
        return "Technical";
    }
    
    private static final String[] WORD_LIST = {
        "abstraction",
        "ambiguous",
        "traditional"};

    private static final String[] SCRAMBLED_WORD_LIST = {
        "batsartcoin",
        "maibuguos",
        "rtdatioialn"
    };
    
    /**
     * Singleton class.
     */
    public TechnicalWordLibrary() {
    }

    /**
     * Gets the word at a given index.
     * @param idx index of required word
     * @return word at that index in its natural form
     */
    public String getWord(int idx) {
        return WORD_LIST[idx];
    }

    /**
     * Gets the word at a given index in its scrambled form.
     * @param idx index of required word
     * @return word at that index in its scrambled form
     */
    public String getScrambledWord(int idx) {
        return SCRAMBLED_WORD_LIST[idx];
    }

    /**
     * Gets the number of words in the library.
     * @return the total number of plain/scrambled word pairs in the library
     */
    public int getSize() {
        return WORD_LIST.length;
    }

    /**
     * Checks whether a user's guess for a word at the given index is correct.
     * @param idx index of the word guessed
     * @param userGuess the user's guess for the actual word
     * @return true if the guess was correct; false otherwise
     */
    public boolean isCorrect(int idx, String userGuess) {
        return userGuess.equals(getWord(idx));
    }


}
