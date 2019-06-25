package rocks.zipcode.io.quiz3.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        String[] strings = new String[str.length()];
        String str1 = str.toLowerCase();
        for(int i = 0; i < str.length(); i++) {
            char ch = Character.toUpperCase(str1.charAt(i));
            StringBuilder stringBuilder = new StringBuilder(str1);
            stringBuilder.setCharAt(i,ch);
            strings[i] = stringBuilder.toString();
        }

        Set<String> set = new HashSet<>(Arrays.asList(strings));
        set.remove(str1);
        return set.toArray(new String[]{});
    }
}
