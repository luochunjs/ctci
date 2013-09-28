package ctci.arrayandstring;

/**
 * Cracking the Coding Interview
 * Chapter 1 | Arrays and Strings
 * 1.1 Implement an algorithm to determine if a string has all unique characters.
 * What if you can not use additional data structures?
 * <p/>
 * User: luochun
 * Date: 28/9/13
 * Time: 6:20 PM
 */
public class UniqueCharactersDetect {

    public static void main(String[] args) {

        for (String s : args) {
            if (hasDuplicate(s)) {
                System.out.println("\"" + s + "\" has duplicate characters.");
            } else {
                System.out.println("\"" + s + "\" does not have duplicate characters.");
            }
        }

    }

    private static boolean hasDuplicate(String word) {

        //initialize boolean array of size 256 (ASCII)
        boolean[] charSet = new boolean[256];

        char[] chars = word.toCharArray();
        for (char c : chars) {
            if (charSet[c]) return true;    //if true then already found
            charSet[c] = true; //set to true if false
        }

        return false;
    }

}
