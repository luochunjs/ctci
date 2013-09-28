package ctci.arrayandstring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: luochun
 * Date: 28/9/13
 * Time: 10:35 PM
 */
public class RemoveDuplicateCharacterInStringTest {

    RemoveDuplicateCharactersInString main = new RemoveDuplicateCharactersInString();

    @Test
    public void withoutDuplicate() {
        String unique = main.removeDuplicate("abcd");
        assertEquals("abcd", unique);
    }

    @Test
    public void withDuplicate() {
        String unique = main.removeDuplicate("abcda");
        assertEquals("abcd", unique);
    }
}
