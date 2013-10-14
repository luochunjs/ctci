package ctci.arrayandstring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Author: luochun
 * Date: 14/10/13 10:18 PM
 */
public class ReplaceStringSpaceTest {

    @Test
    public void noSpace() {
        assertEquals("123", ReplaceStringSpace.replace("123"));
    }

    @Test
    public void oneSpace() {
        assertEquals("1%203", ReplaceStringSpace.replace("1 3"));
    }

    @Test
    public void multipleSpaces() {
        assertEquals("1%203%204", ReplaceStringSpace.replace("1 3 4"));
    }
}
