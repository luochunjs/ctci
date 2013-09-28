package ctci.arrayandstring;

/**
 * Cracking the Coding Interview
 * 1.3 Design an algorithm and write code to remove the duplicate characters in a string without using any additional buffer.
 * NOTE: One or two additional variables are fine. An extra copy of the array is not.
 * FOLLOW UP Write the test cases for this method.
 * <p/>
 * User: luochun
 * Date: 28/9/13
 * Time: 10:33 PM
 */
public class RemoveDuplicateCharactersInString {

    public String removeDuplicate(String input) {

        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length - 1; i++) {
            int c1 = chars[i];
            if (c1 != '\0') {
                for (int j = i + 1; j < chars.length; j++) {
                    char c2 = chars[j];
                    if (c2 != '\0' && c1 == c2) {
                        chars[j] = '\0';
                    }
                }
            }
        }

        return String.valueOf(chars).replaceAll("\0", "");
    }
}
