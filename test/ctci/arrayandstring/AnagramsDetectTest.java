package ctci.arrayandstring;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Author: luochun
 * Date: 14/10/13 10:05 PM
 */
public class AnagramsDetectTest {

    @Test
    public void testSingleChar() {
        boolean result = AnagramsDetect.detect("1", "1");
        assertTrue(result);
    }

    @Test
    public void testDiffLengthString() {
        assertFalse(AnagramsDetect.detect("12", "123"));
    }

    @Test
    public void testSameDoubleString() {
        boolean result = AnagramsDetect.detect("12", "12");
        assertFalse(result);
    }

    @Test
    public void testLongString() {
        assertTrue(AnagramsDetect.detect("1234567", "7654321"));
    }

}
