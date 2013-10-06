package algorithm.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

/**
 * User: luochun
 * Date: 5/10/13
 * Time: 10:54 AM
 */
public class QuickSortTest {

    @Test
    public void test() {
        QuickSort sort = new QuickSort();

        int[] unsorted = new int[]{5, 4, 3, 2, 1};
        sort.sort(unsorted);

        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, unsorted);
    }

    @Test
    public void test2() {
        QuickSort sort = new QuickSort();

        int[] unsorted = new int[]{2, 3, 4, 1, 23, 6, 2, 3, 21, 0, 12};

        sort.sort(unsorted);

        System.out.println(Arrays.toString(unsorted));
        for (int i = 0; i < unsorted.length - 1; i++) {
            assertTrue("order is wrong " + unsorted[i] + "," + unsorted[i + 1], unsorted[i] <= unsorted[i + 1]);
        }
    }
}
