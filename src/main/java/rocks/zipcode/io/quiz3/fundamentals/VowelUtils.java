package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        if (word.contains("a") || word.contains("e") || word.contains("i") || word.contains("o") || word.contains("u")) {
            return true;
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        char[] vowels = {'a','e','o','i','u'};
        String wordLowered =  word.toLowerCase();
        for (int i=0; i < wordLowered.length(); i++){
            for (int j=0; j < vowels.length; j++) {
                if (wordLowered.charAt(i) == vowels[j]){
                    return i;
                }
            }
        }
        return null;
    }

    public static Boolean startsWithVowel(String word) {
        return null;
    }

    public static Boolean isVowel(Character character) { return null; }
}
