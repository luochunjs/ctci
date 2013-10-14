package ctci.arrayandstring;

/**
 * Author: luochun
 * Date: 14/10/13 10:20 PM
 */
public class ReplaceStringSpace {
    public static String replace(String s) {

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') count++;
        }

        char[] chars = new char[s.length() + 2 * count];

        int j = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                chars[j++] = '%';
                chars[j++] = '2';
                chars[j++] = '0';
            } else {
                chars[j++] = s.charAt(i);
            }
        }
        return new String(chars);
    }
}
