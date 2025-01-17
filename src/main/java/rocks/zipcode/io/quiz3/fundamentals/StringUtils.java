package rocks.zipcode.io.quiz3.fundamentals;

import java.util.*;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {

        String string = str.substring(0,indexToCapitalize) + Character.toUpperCase(str.charAt(indexToCapitalize))+str.substring(indexToCapitalize + 1);
        return string;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {

        return baseString.charAt(indexOfString)==characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {
        Set<String> list = new LinkedHashSet<>();
        for(int i = 0 ; i < string.length(); i++) {
            for(int j = i+1; j <= string.length(); j++) {
               list.add(string.substring(i,j));
            }
        }
        return list.toArray(new String[]{});
    }

    public static Integer getNumberOfSubStrings(String input){

        return getAllSubStrings(input).length;
    }
}
