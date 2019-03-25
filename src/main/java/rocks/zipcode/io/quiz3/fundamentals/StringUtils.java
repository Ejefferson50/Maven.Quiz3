package rocks.zipcode.io.quiz3.fundamentals;

import java.util.*;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {

        /*
        Nhu
        String beginning = str.substring(0, indexToCapitalize);
        Character upperCase = Character.toUpperCase(str.charAt(indexToCaptialize));
        String ending = str.substring(indexToCapitalize + 1))
         */
        String string = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i == indexToCapitalize) {
                string += Character.toUpperCase(c);
            } else {
                string += c;
            }
        }
        return string;

    }


    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        if (baseString.charAt(indexOfString) == characterToCheckFor) {
            return true;
        }
        return false;
    }

    public static String[] getAllSubStrings(String string) {
        List<String> result = new ArrayList<>();
        List<String> checkDupes = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                result.add(string.substring(i, j));
            }
        }
        for (String s : result) {
            if (!checkDupes.contains(s)) {
                checkDupes.add(s);
            }
        }
        //Set<String> = new HashSet()<result>;
        return checkDupes.toArray(new String[0]);
    }

    public static Integer getNumberOfSubStrings(String input) {
        return getAllSubStrings(input).length;
    }
}
