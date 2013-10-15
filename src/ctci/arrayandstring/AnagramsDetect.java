package ctci.arrayandstring;

import java.util.Arrays;

/**
 *
 * 1.4 detect if two Strings are anagram
 * Author: luochun
 * Date: 14/10/13 10:04 PM
 */
public class AnagramsDetect {

    public static boolean detect(String s1, String s2) {

        if(s1.equals("") || s2.equals("")) return false;

        if(s1.length() != s2.length()) return false;

        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);
    }
}
