package algorithm.sort;

import java.util.Arrays;

/**
 * User: luochun
 * Date: 5/10/13
 * Time: 10:54 AM
 */
public class QuickSort {


    public int[] sort(int[] unsorted) {

        quickSort(0, unsorted.length - 1, unsorted);

        return unsorted;
    }

    private void quickSort(int start, int end, int[] unsorted) {
        if (start >= end) return;

        int pivotIndex = partition(start, end, unsorted);

        quickSort(start, pivotIndex - 1, unsorted);
        quickSort(pivotIndex + 1, end, unsorted);
    }

    private int partition(int start, int end, int[] unsorted) {

        int pivotValue = unsorted[start]; //pick first element as pivot
        int startIdx = start + 1;
        int endIdx = end;

        while (startIdx < endIdx) {
            int left = findFromLeft(startIdx, endIdx, pivotValue, unsorted);
            int right = findFromRight(startIdx, endIdx, pivotValue, unsorted);
            if (left < right) {
                swap(left, right, unsorted);
                startIdx = left + 1;
                endIdx = right - 1;
            } else {
                break;
            }
        }

        for (int i = start + 1; i <= end; i++) {
            if (unsorted[i] > pivotValue) {
                swap(start, i - 1, unsorted);
                return i - 1;
            }
        }
        swap(start, end, unsorted);

        return end;

    }

    private int findFromRight(int startIdx, int endIdx, int pivotValue, int[] unsorted) {
        for (int i = endIdx; i >= startIdx; i--) {
            if (unsorted[i] < pivotValue) {
                return i;
            }
        }
        return startIdx;
    }

    private int findFromLeft(int startIdx, int endIdx, int pivotValue, int[] unsorted) {
        for (int i = startIdx; i <= endIdx; i++) {
            if (unsorted[i] > pivotValue) {
                return i;
            }
        }
        return endIdx;
    }

    private int swap(int from, int to, int[] unsorted) {
        if (from >= to) return from;

        int tmp = unsorted[from];
        unsorted[from] = unsorted[to];
        unsorted[to] = tmp;

        return to;
    }
}
