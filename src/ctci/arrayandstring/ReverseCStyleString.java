package ctci.arrayandstring;

/**
 * Cracking the Coding Interview
 * 1.2 Write code to reverse a C-Style String.
 * (C-String means that “abcd” is represented as five characters, including the null character.)
 *
 * User: luochun
 * Date: 28/9/13
 * Time: 10:11 PM
 */
public class ReverseCStyleString {

    public static void main(String[] args) {
        for (String s : args) {
            System.out.println("Reverse of " + s + " is " + reverse(s));
        }
    }

    private static String reverse(String s) {
        char[] chars = s.toCharArray();
        char[] newChars = new char[chars.length];

        for (int i = 0; i < chars.length - 1; i++) {
            newChars[i] = chars[chars.length - 2 - i];
        }
        newChars[chars.length - 1] = chars[chars.length - 1];

        return new String(newChars);
    }
}
