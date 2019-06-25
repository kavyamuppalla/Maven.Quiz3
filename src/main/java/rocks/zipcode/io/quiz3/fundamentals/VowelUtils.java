package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        if(word.contains("a") || word.contains("e") || word.contains("i") || word.contains("o") || word.contains("u")) {
            return true;
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        int a = word.toLowerCase().indexOf('a');
        int e = word.toLowerCase().indexOf('e');
        int i = word.toLowerCase().indexOf('i');
        int o = word.toLowerCase().indexOf('o');
        int u = word.toLowerCase().indexOf('u');

        if(a < e && a < i && a < o && a < u && a > 0) {
            return a;
        }
        else if( e < i && e < o && e < u && e < a && e > 0) {
            return e;
        }
        else if(i < e && i < o && i < u && i < a && i > 0) {
            return i;
        }
        else if(o < u && o < a && o < e && o < i && o > 0) {
            return o;
        }
        else if(u < a && u < e && u < i && u < o && u > 0) {
            return u;
        }
        return -1;
    }


    public static Boolean startsWithVowel(String word) {
        if(word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o") || word.startsWith("u")
        && word.startsWith("A") || word.startsWith("E") || word.startsWith("I") || word.startsWith("O") || word.startsWith("U")) {
            return true;
        }
        return false;
    }

    public static Boolean isVowel(Character character) {
        if(character.equals(character)) {
            return true;
        }
        return false;
    }
}
