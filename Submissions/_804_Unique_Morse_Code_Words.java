import java.util.Arrays;

//https://leetcode.com/problems/unique-morse-code-words/
// #804
// Easy

class _804_Unique_Morse_Code_Words {

    String[] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> uniqueWords = new HashSet<String>();

        int uniqueTransformations = 0;

        for(String word : words) {
            String morseWord = transformWord(word);
            if(!uniqueWords.contains(morseWord)) {
                uniqueTransformations++;
                uniqueWords.add(morseWord);
            }
        }
        return uniqueTransformations;
    }

    private String transformWord(String word) {

        StringBuilder transformedWord = new StringBuilder();

        for(Character character : word.toCharArray())
        {
            transformedWord.append(morseCode[(int)character - 97]);
        }

        return transformedWord.toString();
    }

}