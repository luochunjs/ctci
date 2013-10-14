package ctci.arrayandstring;

/**
 *
 * 1.4 detect if two Strings are anagram
 * Author: luochun
 * Date: 14/10/13 10:04 PM
 */
public class AnagramsDetect {

    public static boolean detect(String s1, String s2) {
        if(s1.length() != s2.length()) return false;

        for(int i = 0; i< s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(s1.length() - 1 - i)) return false;
        }
        return true;
    }
}
